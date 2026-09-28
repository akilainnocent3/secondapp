package defpackage;

import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                u6jVar.o0(new r6j(u6jVar));
                u6jVar.b0 = false;
                u6jVar.o0(new o0j(u6jVar));
                break;
            default:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(80);
                }
                break;
        }
        return Unit.a;
    }
}
