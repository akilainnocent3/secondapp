package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y91 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y91 f158201b = new y91();

    public y91() {
        super(0);
    }

    @Override // ds.a
    public final Object invoke() {
        dr.i0 i0Var = z91.f158668a;
        List listO5 = cv.p0.o5("adsdk.yandex.ru,yandex.ru", new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO5) {
            if (!cv.p0.O3((String) obj)) {
                arrayList.add(obj);
            }
        }
        dr.i0 i0Var2 = z91.f158668a;
        return fr.r0.J4(arrayList, "yandex.com/ads");
    }
}
