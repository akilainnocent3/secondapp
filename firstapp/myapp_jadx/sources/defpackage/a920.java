package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.pocketrocket.model.response.RecentRoundMultiplier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a920 extends Dialog {
    public fn1 a;
    public ibs b;
    public zh40.a c;
    public eoa0 d;
    public b920 e;
    public zh40 f;
    public List<RecentRoundMultiplier.Coefficients> i;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportygames.pocketrocket.component.PrRoundHistory$onCreate$2", f = "PrRoundHistory.kt", l = {61, 67, 73}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public AppCompatImageView a;
        public int b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return a920.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0083  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            AppCompatImageView appCompatImageView;
            AppCompatImageView appCompatImageView2;
            AppCompatImageView appCompatImageView3;
            Object objC;
            AppCompatImageView appCompatImageView4;
            y5b y5bVar = y5b.a;
            int i = this.b;
            a920 a920Var = a920.this;
            if (i == 0) {
                uj50.b(obj);
                appCompatImageView = a920Var.a().v;
                s4u<String, Bitmap> s4uVar = r9n.a;
                Context context = a920Var.getContext();
                this.a = appCompatImageView;
                this.b = 1;
                obj = r9n.c(this, context, "red_rocket_with_fire_png");
                if (obj != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                appCompatImageView = this.a;
                uj50.b(obj);
            } else {
                if (i == 2) {
                    appCompatImageView2 = this.a;
                    uj50.b(obj);
                    appCompatImageView2.setImageBitmap((Bitmap) obj);
                    appCompatImageView3 = a920Var.a().c;
                    s4u<String, Bitmap> s4uVar2 = r9n.a;
                    Context context2 = a920Var.getContext();
                    this.a = appCompatImageView3;
                    this.b = 3;
                    objC = r9n.c(this, context2, "blue_rocket_with_fire_png");
                    if (objC != y5bVar) {
                        obj = objC;
                        appCompatImageView4 = appCompatImageView3;
                    }
                    return y5bVar;
                }
                if (i != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                appCompatImageView4 = this.a;
                uj50.b(obj);
            }
            appCompatImageView4.setImageBitmap((Bitmap) obj);
            return Unit.a;
            appCompatImageView.setImageBitmap((Bitmap) obj);
            appCompatImageView2 = a920Var.a().i;
            s4u<String, Bitmap> s4uVar3 = r9n.a;
            Context context3 = a920Var.getContext();
            this.a = appCompatImageView2;
            this.b = 2;
            obj = r9n.c(this, context3, "purple_rocket_with_fire_png");
            if (obj != y5bVar) {
                appCompatImageView2.setImageBitmap((Bitmap) obj);
                appCompatImageView3 = a920Var.a().c;
                s4u<String, Bitmap> s4uVar4 = r9n.a;
                Context context4 = a920Var.getContext();
                this.a = appCompatImageView3;
                this.b = 3;
                objC = r9n.c(this, context4, "blue_rocket_with_fire_png");
                if (objC != y5bVar) {
                    obj = objC;
                    appCompatImageView4 = appCompatImageView3;
                    appCompatImageView4.setImageBitmap((Bitmap) obj);
                    return Unit.a;
                }
            }
            return y5bVar;
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public c(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public final b920 a() {
        b920 b920Var = this.e;
        if (b920Var != null) {
            return b920Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final void b() {
        ibs ibsVar = this.b;
        try {
            this.a.B.f(ibsVar, new c(new nsj(this, 1)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d.e.f(ibsVar, new c(new mj6(this, 1)));
    }

    public final void c(List<RecentRoundMultiplier.Coefficients> list) {
        RecyclerView recyclerView = a().e;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        list.getClass();
        List<RecentRoundMultiplier.Coefficients> listB = y8h0.b(list);
        this.i = listB;
        Context context = getContext();
        context.getClass();
        this.f = new zh40(listB, context, this.c);
        RecyclerView recyclerView2 = a().e;
        zh40 zh40Var = this.f;
        if (zh40Var != null) {
            recyclerView2.setAdapter(zh40Var);
        } else {
            Intrinsics.n("adapter");
            throw null;
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ibs ibsVar = this.b;
        fn1 fn1Var = this.a;
        super.onCreate(bundle);
        try {
            this.e = b920.a(getLayoutInflater());
            setContentView(a().a);
            fn1Var.getClass();
            ej5.c(o8i0.d(fn1Var), null, null, new in1(fn1Var, null), 3);
            fn1Var.B.l(ibsVar);
            this.d.e.l(ibsVar);
            b();
            a().f.setOnClickListener(new x820(this, 0));
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new b(null), 3);
            op5.r(op5.a, kotlin.collections.b.f(a().d), null, 4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
