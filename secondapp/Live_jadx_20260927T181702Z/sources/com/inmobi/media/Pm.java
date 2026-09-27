package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 com.inmobi.media.Pm[], still in use, count: 1, list:
  (r12v3 com.inmobi.media.Pm[]) from 0x0059: INVOKE (r12v3 com.inmobi.media.Pm[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:90)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Pm {
    /* JADX INFO: Fake field, exist only in values array */
    SHOW_VIDEO("show"),
    /* JADX INFO: Fake field, exist only in values array */
    HIDE_VIDEO("hide"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAY_VIDEO("resume"),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSE_VIDEO("pause"),
    /* JADX INFO: Fake field, exist only in values array */
    MUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_MUTE),
    /* JADX INFO: Fake field, exist only in values array */
    UNMUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE),
    /* JADX INFO: Fake field, exist only in values array */
    SKIP_VIDEO(com.google.android.material.timepicker.h.f51923u);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ sr.a f55332c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55333a;

    static {
        f55332c = sr.c.c(pmArr);
    }

    public Pm(String str) {
        super(str, i);
        this.f55333a = str;
    }

    public static Pm valueOf(String str) {
        return (Pm) Enum.valueOf(Pm.class, str);
    }

    public static Pm[] values() {
        return (Pm[]) f55331b.clone();
    }
}
