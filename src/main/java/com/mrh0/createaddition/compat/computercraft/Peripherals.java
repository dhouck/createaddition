package com.mrh0.createaddition.compat.computercraft;

import com.mrh0.createaddition.blocks.digital_adapter.DigitalAdapterBlockEntity;
import com.mrh0.createaddition.blocks.electric_motor.ElectricMotorBlockEntity;
import com.mrh0.createaddition.blocks.redstone_relay.RedstoneRelayBlockEntity;

public class Peripherals {
	public static ElectricMotorPeripheral createElectricMotorPeripheral(ElectricMotorBlockEntity te) {
		return new ElectricMotorPeripheral("electric_motor", te);
	}

	public static PortableEnergyInterfacePeripheral createPortableEnergyInterfacePeripheral(PortableEnergyInterfaceBlockEntity te) {
		return new PortableEnergyInterfacePeripheral("portable_energy_interface", te);
	}

	public static ModularAccumulatorPeripheral createModularAccumulatorPeripheral(ModularAccumulatorBlockEntity te) {
		return new ModularAccumulatorPeripheral("modular_accumulator", te);
	}

	public static RedstoneRelayPeripheral createRedstoneRelayPeripheral(RedstoneRelayBlockEntity te) {
		return new RedstoneRelayPeripheral("redstone_relay", te);
	}

	public static DigitalAdapterPeripheral createDigitalAdapterPeripheral(DigitalAdapterBlockEntity te) {
		return new DigitalAdapterPeripheral("digital_adapter", te);
	}
}
