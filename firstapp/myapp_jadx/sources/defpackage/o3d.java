package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.antest.DebugVariantScreenKt$DebugVariantScreen$1$1", f = "DebugVariantScreen.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class o3d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y3d b;
    public final /* synthetic */ Context c;

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.debugscreen.impl.antest.DebugVariantScreenKt$DebugVariantScreen$1$1$1", f = "DebugVariantScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<y3d.c, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(y3d.c cVar, v1b<? super Unit> v1bVar) {
            return ((a) create(cVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y3d.c cVar = (y3d.c) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            StringUiText stringUiTextA = cVar.a();
            Context context = this.b;
            Toast.makeText(context, stringUiTextA.g(context), 0).show();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3d(y3d y3dVar, Context context, v1b<? super o3d> v1bVar) {
        super(2, v1bVar);
        this.b = y3dVar;
        this.c = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o3d(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o3d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.f;
            a aVar = new a(this.c, null);
            this.a = 1;
            if (kzh.b(b390Var, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(vZBMKENANSz.SInr);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
