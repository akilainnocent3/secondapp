package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yif0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yif0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zif0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ajf0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final mmd mmdVar = (mmd) obj3;
                final ytw ytwVar = (ytw) obj2;
                final Function0 function0 = (Function0) obj;
                ?? r0 = new Function1() { // from class: zif0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return (gly) function0.invoke();
                    }
                };
                ?? r4 = new Function1() { // from class: ajf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        k7f k7fVar = (k7f) obj4;
                        float fC = k7f.c(k7fVar.a);
                        mmd mmdVar2 = mmdVar;
                        ytwVar.setValue(new jxo((((long) mmdVar2.y0(fC)) << 32) | (((long) mmdVar2.y0(k7f.b(k7fVar.a))) & 4294967295L)));
                        return Unit.a;
                    }
                };
                if (ciu.a()) {
                    return ciu.a() ? new MagnifierElement(r0, r4, Build.VERSION.SDK_INT == 28 ? kj10.a : lj10.a) : d.a.b;
                }
                zkh.a("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                ej5.c((v5b) obj3, null, null, new i0k0((Function1) obj2, ((Integer) obj).intValue(), null), 3);
                return Unit.a;
        }
    }
}
