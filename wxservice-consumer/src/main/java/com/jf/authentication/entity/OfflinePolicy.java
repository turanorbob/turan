package com.jf.authentication.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author turan
 * @since 2017-08-07
 */
@TableName("offline_policy")
public class OfflinePolicy extends Model<OfflinePolicy> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("offline_time")
	private Integer offlineTime;
	private String description;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(Integer offlineTime) {
		this.offlineTime = offlineTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "OfflinePolicy{" +
			"id=" + id +
			", offlineTime=" + offlineTime +
			", description=" + description +
			"}";
	}
}
