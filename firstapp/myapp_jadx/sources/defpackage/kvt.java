package defpackage;

import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.LoyaltyHomeScreenKt$LoyaltyHomeScreen$15$1", f = "LoyaltyHomeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kvt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ y0u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvt(Context context, String str, y0u y0uVar, v1b<? super kvt> v1bVar) {
        super(2, v1bVar);
        this.a = context;
        this.b = str;
        this.c = y0uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kvt(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kvt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ((y0u.b) this.c).getClass();
        Toast.makeText(this.a, this.b, 0).show();
        return Unit.a;
    }
}
