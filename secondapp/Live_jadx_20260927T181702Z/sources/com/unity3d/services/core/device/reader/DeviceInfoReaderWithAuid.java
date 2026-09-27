package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Device;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nDeviceInfoReaderWithAuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoReaderWithAuid.kt\ncom/unity3d/services/core/device/reader/DeviceInfoReaderWithAuid\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
public final class DeviceInfoReaderWithAuid implements IDeviceInfoReader {

    @l
    private final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderWithAuid(@l IDeviceInfoReader _deviceInfoReader) {
        m0.p(_deviceInfoReader, "_deviceInfoReader");
        this._deviceInfoReader = _deviceInfoReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    @l
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        m0.o(deviceInfoData, "_deviceInfoReader.deviceInfoData");
        String auid = Device.getAuid();
        if (auid != null) {
            deviceInfoData.put("auid", auid);
        }
        return deviceInfoData;
    }
}
