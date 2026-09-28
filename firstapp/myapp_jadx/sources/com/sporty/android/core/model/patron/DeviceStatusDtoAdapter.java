package com.sporty.android.core.model.patron;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.itf0;
import defpackage.w8h0;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sporty/android/core/model/patron/DeviceStatusDtoAdapter;", "Lw8h0;", "Lcom/sporty/android/core/model/patron/DeviceStatusDto;", "<init>", "()V", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "", "write", "(Lcom/google/gson/stream/JsonWriter;Lcom/sporty/android/core/model/patron/DeviceStatusDto;)V", "Lcom/google/gson/stream/JsonReader;", "in", "read", "(Lcom/google/gson/stream/JsonReader;)Lcom/sporty/android/core/model/patron/DeviceStatusDto;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DeviceStatusDtoAdapter extends w8h0<DeviceStatusDto> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.w8h0
    public DeviceStatusDto read(JsonReader in) throws IOException {
        in.getClass();
        String strNextString = in.nextString();
        if (strNextString == null) {
            return DeviceStatusDto.LOGOUT;
        }
        try {
            String upperCase = strNextString.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return DeviceStatusDto.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            itf0.a aVar = itf0.a;
            aVar.q("DeviceStatusDto");
            aVar.n("Unknown device status received: '" + strNextString + "'. Falling back to LOGOUT.", new Object[0]);
            return DeviceStatusDto.LOGOUT;
        }
    }

    @Override // defpackage.w8h0
    public void write(JsonWriter out, DeviceStatusDto value) throws IOException {
        out.getClass();
        if (value == null) {
            out.nullValue();
        } else {
            out.value(value.name());
        }
    }
}
