package org.jks.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageTransfer {
	String srcFilePath;
	String destPath;
	int width;
	int height;
	String suffix;

	public static BufferedImage transfer(String srcFilePath, double ratio) throws Exception{
		BufferedImage bufferedImage = from(srcFilePath);
		int width = bufferedImage.getWidth();  
        int height = bufferedImage.getHeight();
        
        int toWidth = (int) (width * ratio);  
        int toHeight = (int) (height * ratio);
       
        return transfer(bufferedImage, toWidth, toHeight);
	}
	
	public static BufferedImage from(String srcFilePath) throws Exception{
		File srcFile = new File(srcFilePath);
		if (!srcFile.isFile()){
			throw new Exception("src must be file");
		}
		return ImageIO.read(srcFile);
	}
	
	public static BufferedImage transfer(BufferedImage bufferedImage, int toWidth, int toHeight){
		
        
        BufferedImage result = null; 
        result = new BufferedImage(toWidth, toHeight,  
                BufferedImage.TYPE_INT_RGB);  

        result.getGraphics().drawImage(  
        		bufferedImage.getScaledInstance(toWidth, toHeight,  
                        java.awt.Image.SCALE_SMOOTH), 0, 0, null);  
        return result;
	}
	
	public static void save(BufferedImage bufferedImage) throws IOException{
		String fileName = System.currentTimeMillis() + ".jpg";
		File outputfile = new File(fileName);
		ImageIO.write(bufferedImage, "jpg",outputfile);
	}

	public static void main(String[] args) throws Exception {
		BufferedImage bufferedImage = from("D:\\osc-project\\turan\\fk.jpg");
		BufferedImage outBufferedImage = transfer(bufferedImage, 150,150);
		save(outBufferedImage);
	}
}
