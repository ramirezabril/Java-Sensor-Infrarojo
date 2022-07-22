import java.io.IOException; 
import java.util.Arrays; 
import com.pi4j.io.i2c.I2CBus; 
import com.pi4j.io.i2c.I2CDevice; 
import com.pi4j.io.i2c.I2CFactory; 
import com.pi4j.io.i2c.I2CFactory.UnsupportedBusNumberException; 
import com.pi4j.platform.PlatformAlreadyAssignedException; 
import com.pi4j.util.Console; 

public class Sensor_infrarojo { 
        public static void main(String args[]) throws Exception{ 
                I2CBus bus = I2CFactory.getInstance(I2CBus.BUS_1); 
                I2CDevice device = bus.getDevice(0x5A); 
                device.write((byte)0x07);
                int response= device.read(0x06);
                System.out.println("Lectura: " + String.format("0x%02x", response)); 
        } 
} 

