package defpackage;

import android.content.Context;
import com.sportybet.android.cms.UpdateCMSWorker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class sb40 {
    public final Context a;
    public final wwd0 b;

    @c0d(c = "com.sportybet.android.cms.RealtimeCMSWorkerLauncher$1", f = "RealtimeCMSWorkerLauncher.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ jb40 b;
        public final /* synthetic */ sb40 c;

        /* JADX INFO: renamed from: sb40$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.cms.RealtimeCMSWorkerLauncher$1$1", f = "RealtimeCMSWorkerLauncher.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1086a extends tje0 implements gaj<Boolean, Long, v1b<? super Unit>, Object> {
            public /* synthetic */ boolean a;
            public /* synthetic */ long b;
            public final /* synthetic */ sb40 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1086a(sb40 sb40Var, v1b<? super C1086a> v1bVar) {
                super(3, v1bVar);
                this.c = sb40Var;
            }

            @Override // defpackage.gaj
            public final Object invoke(Boolean bool, Long l, v1b<? super Unit> v1bVar) {
                boolean zBooleanValue = bool.booleanValue();
                long jLongValue = l.longValue();
                C1086a c1086a = new C1086a(this.c, v1bVar);
                c1086a.a = zBooleanValue;
                c1086a.b = jLongValue;
                return c1086a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                boolean z = this.a;
                long j = this.b;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                if (z && j > 0) {
                    ury uryVarA = new ury.a(UpdateCMSWorker.class).a();
                    svj0 svj0VarC = svj0.c(this.c.a);
                    svj0VarC.getClass();
                    List listC = kotlin.collections.a.c(uryVarA);
                    if (listC.isEmpty()) {
                        hb5.a("beginUniqueWork needs at least one OneTimeWorkRequest.");
                        return null;
                    }
                    new ruj0(svj0VarC, "cms_update_worker", lvg.b, listC).X();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jb40 jb40Var, sb40 sb40Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = jb40Var;
            this.c = sb40Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                v340 v340VarC = this.b.c();
                sb40 sb40Var = this.c;
                n1i n1iVar = new n1i(v340VarC, sb40Var.b, new C1086a(sb40Var, null));
                zu7.a aVar = zu7.a;
                pfd pfdVar = fse.a;
                lyh lyhVarC = ozh.c(n1iVar, gku.a);
                this.a = 1;
                if (kzh.a(lyhVarC, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public sb40(jb40 jb40Var, Context context) {
        jb40Var.getClass();
        this.a = context;
        this.b = xwd0.a(-1L);
        zu7.a aVar = zu7.a;
        ej5.c(zu7.b(null), null, null, new a(jb40Var, this, null), 3);
    }
}
