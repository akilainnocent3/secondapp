package yads;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v5 yads.yf2[], still in use, count: 1, list:
  (r4v5 yads.yf2[]) from 0x003b: INVOKE (r4v5 yads.yf2[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:60)
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
/* JADX INFO: loaded from: classes9.dex */
public final class yf2 {
    /* JADX INFO: Fake field, exist only in values array */
    Flutter(fr.g0.l("io.flutter.embedding.android.FlutterActivity")),
    /* JADX INFO: Fake field, exist only in values array */
    ReactNative(fr.g0.l("com.facebook.react.bridge.ReactContext")),
    /* JADX INFO: Fake field, exist only in values array */
    Unity(fr.h0.Q(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME, "com.unity3d.player.UnityPlayerActivity"));


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ sr.a f158285d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f158286b;

    static {
        f158285d = sr.c.c(yf2VarArr);
    }

    public yf2(List list) {
        super(str, i);
        this.f158286b = list;
    }

    public static yf2 valueOf(String str) {
        return (yf2) Enum.valueOf(yf2.class, str);
    }

    public static yf2[] values() {
        return (yf2[]) f158284c.clone();
    }
}
