package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class kbh {
    public static final /* synthetic */ kbh[] a = {new kbh("FBG_TOAST_COMPLETE_MISSION", 0), new kbh("FBG_TOAST_CAMPAIGN_ACTIVATED", 1), new kbh("FBG_TOAST_TICKET_IMAGE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    kbh EF5;

    public static kbh valueOf(String str) {
        return (kbh) Enum.valueOf(kbh.class, str);
    }

    public static kbh[] values() {
        return (kbh[]) a.clone();
    }
}
