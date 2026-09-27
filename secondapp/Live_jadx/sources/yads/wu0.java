package yads;

import com.ironsource.C4235d4;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wu0 extends kotlin.jvm.internal.o0 implements ds.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wu0 f157510b = new wu0();

    public wu0() {
        super(1);
    }

    public static String a(Map.Entry entry) {
        return entry.getKey() + C4235d4.j.f61456b + entry.getValue();
    }

    @Override // ds.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }
}
