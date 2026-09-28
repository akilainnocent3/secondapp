package defpackage;

import androidx.compose.animation.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s6a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ s6a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(90.0f);
                a7lVar.t(a7lVar.C1(8.0f));
                a7lVar.l(false);
                return Unit.a;
            case 1:
                return f.g(yi0.e(700, 0, null, 6), 2);
            default:
                String str = (String) obj;
                str.getClass();
                return "\"" + str + "\"";
        }
    }
}
