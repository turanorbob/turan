package org.jks.zookeeper;

import org.apache.zookeeper.*;

import java.util.concurrent.CountDownLatch;

/**
 * Created by turan on 2017/8/1 0001.
 */
public class ZookeeperTest implements Watcher{
    private static CountDownLatch connectedSemaphore = new CountDownLatch(1);

    public static void main(String[] args) throws Exception {
        ZooKeeper zookeeper = new ZooKeeper("192.168.254.128:44444", 5000, new ZookeeperTest());
        System.out.println(zookeeper.getState());
        connectedSemaphore.await();

        String path1 = zookeeper.create("/aaa/bbb", "aaa".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println("Success create znode: " + path1);

    }

    public void process(WatchedEvent event) {
        if (Event.KeeperState.SyncConnected == event.getState()) {
            connectedSemaphore.countDown();
        }
    }
}
