package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.android.openbet.presentation.viewmodel.OpenBetSharedViewModel$loadBookCode$1", f = "OpenBetSharedViewModel.kt", l = {113}, m = "invokeSuspend", v = 2)
public final class m0z extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public n0z a;
    public boolean b;
    public boolean c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ n0z f;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0z(n0z n0zVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.f = n0zVar;
        this.i = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m0z m0zVar = new m0z(this.f, this.i, v1bVar);
        m0zVar.e = obj;
        return m0zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m0z) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        UiText uiTextE;
        boolean z;
        n0z n0zVar = this.f;
        ssw<wvs> sswVar = n0zVar.J;
        y5b y5bVar = y5b.a;
        int i = this.d;
        boolean z2 = true;
        String str = null;
        try {
            if (i == 0) {
                uj50.b(obj);
                sswVar.m(wvs.c.a);
                String str2 = this.i;
                zi50.a aVar = zi50.b;
                x4k x4kVar = n0zVar.d;
                this.e = null;
                this.a = n0zVar;
                this.b = true;
                this.c = true;
                this.d = 1;
                obj = x4kVar.a(str2, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                z = true;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z3 = this.c;
                boolean z4 = this.b;
                n0z n0zVar2 = this.a;
                uj50.b(obj);
                n0zVar = n0zVar2;
                z = z3;
                z2 = z4;
            }
            n0zVar.J.m(n0zVar.z1(((v4k) obj).a, z2, z));
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_OPEN_BET);
            aVar4.o(thA);
            if (thA instanceof SprThrowable) {
                uiTextE = ((SprThrowable) thA).b();
            } else if (thA instanceof IOException) {
                uiTextE = vch0.c;
            } else {
                String message = thA.getMessage();
                if (message != null && !StringsKt.U(message)) {
                    str = message;
                }
                uiTextE = vch0.e(str);
                if (uiTextE == null) {
                    uiTextE = vch0.b;
                }
            }
            sswVar.m(new wvs.a(uiTextE));
        }
        return Unit.a;
    }
}
