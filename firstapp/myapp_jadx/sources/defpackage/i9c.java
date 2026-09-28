package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.custom.CustomCodeLoadPanelKt$CodeInput$1$1", f = "CustomCodeLoadPanel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i9c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ytw<Boolean> b;
    public final /* synthetic */ ytw<ijf0> c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9c(boolean z, ytw<Boolean> ytwVar, ytw<ijf0> ytwVar2, ytw<Boolean> ytwVar3, v1b<? super i9c> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = ytwVar;
        this.c = ytwVar2;
        this.d = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i9c(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i9c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z2 = this.a;
        this.b.setValue(Boolean.valueOf(z2));
        if (!z2) {
            ytw<ijf0> ytwVar = this.c;
            String str = ytwVar.getValue().a.b;
            z = false;
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    if (ytwVar.getValue().a.b.length() != 0) {
                        break;
                    }
                    break;
                }
                if (Character.isLetterOrDigit(str.charAt(i))) {
                    i++;
                }
                z = true;
                break;
            }
        }
        z = true;
        break;
        this.d.setValue(Boolean.valueOf(z));
        return Unit.a;
    }
}
