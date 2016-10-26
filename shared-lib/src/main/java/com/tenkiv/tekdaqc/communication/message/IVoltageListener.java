package com.tenkiv.tekdaqc.communication.message;

import com.tenkiv.tekdaqc.hardware.AAnalogInput;
import tec.uom.se.spi.Measurement;

import javax.measure.quantity.ElectricPotential;

/**
 * Interface defining methods for receiving broadcasts of a single analog input channel.
 * Its should be noted adding a large number of single channel listeners can effect performance on slower computers.
 *
 * @author Tenkiv (software@tenkiv.com)
 * @since v3.0.0.0
 */
public interface IVoltageListener {

    /**
     * Called when a voltage is received for the given input channel.
     *
     * @param input The {@link AAnalogInput} which has received the data.
     * @param measurement The {@link Measurement} of the Voltage received by the ADC.
     */
    void onVoltageDataReceived(AAnalogInput input, PLACEHOLDER_MEASUREMENT<ElectricPotential> measurement);
}
