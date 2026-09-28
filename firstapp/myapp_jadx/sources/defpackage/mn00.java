package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mn00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mn00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                yfx.h((hjx) obj2, new a0c.c(str), null, 6);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ((Function1) obj2).invoke(new b.n(str2));
                break;
            default:
                ((yrg0) obj2).i.m(jox.e.a);
                break;
        }
        return Unit.a;
    }
}
