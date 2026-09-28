package defpackage;

import android.content.Context;
import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.forceupdate.ForceUpdateDebugViewModel$launchWithRealApk$1", f = "ForceUpdateDebugViewModel.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class hti extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iti c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hti(iti itiVar, Context context, v1b<? super hti> v1bVar) {
        super(2, v1bVar);
        this.c = itiVar;
        this.d = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hti htiVar = new hti(this.c, this.d, v1bVar);
        htiVar.b = obj;
        return htiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hti) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        iti itiVar = this.c;
        wwd0 wwd0Var = itiVar.d;
        wwd0 wwd0Var2 = itiVar.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                Boolean bool = Boolean.TRUE;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bool);
                wwd0Var.setValue(null);
                Context context = this.d;
                zi50.a aVar = zi50.b;
                ysi ysiVar = itiVar.a;
                this.b = null;
                this.a = 1;
                if (ysiVar.a(context, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            String str = "Failed to fetch version data: " + thA.getMessage();
            wwd0Var.getClass();
            wwd0Var.k(null, str);
        }
        Boolean bool2 = Boolean.FALSE;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bool2);
        return Unit.a;
    }
}
