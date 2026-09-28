package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsViewModel$onLiveEventNotificationClicked$1", f = "SettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gm80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nm80 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ boolean d;

    @c0d(c = "com.sportybet.feature.settings.SettingsViewModel$onLiveEventNotificationClicked$1$1", f = "SettingsViewModel.kt", l = {149}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ nm80 c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nm80 nm80Var, Context context, boolean z, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = nm80Var;
            this.d = context;
            this.e = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    nm80 nm80Var = this.c;
                    Context context = this.d;
                    boolean z = this.e;
                    zi50.a aVar = zi50.b;
                    fls flsVar = nm80Var.a;
                    this.b = null;
                    this.a = 1;
                    if (flsVar.a(context, z, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                Unit unit = Unit.a;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable unused) {
                zi50.a aVar3 = zi50.b;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm80(nm80 nm80Var, Context context, boolean z, v1b<? super gm80> v1bVar) {
        super(2, v1bVar);
        this.b = nm80Var;
        this.c = context;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gm80 gm80Var = new gm80(this.b, this.c, this.d, v1bVar);
        gm80Var.a = obj;
        return gm80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gm80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ej5.c(v5bVar, null, null, new a(this.b, this.c, this.d, null), 3);
        return Unit.a;
    }
}
