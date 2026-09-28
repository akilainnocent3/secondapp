package defpackage;

import com.twilio.voice.VoiceURLConnection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lnu {
    public static final lnu a;
    public static final lnu b;
    public static final /* synthetic */ lnu[] c;

    static {
        lnu lnuVar = new lnu("EDIT", 0);
        a = lnuVar;
        lnu lnuVar2 = new lnu(VoiceURLConnection.METHOD_TYPE_DELETE, 1);
        b = lnuVar2;
        c = new lnu[]{lnuVar, lnuVar2};
    }

    public lnu() {
        throw null;
    }

    public static lnu valueOf(String str) {
        return (lnu) Enum.valueOf(lnu.class, str);
    }

    public static lnu[] values() {
        return (lnu[]) c.clone();
    }
}
