package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.activity.MatchEventActivity$setupViewModel$$inlined$collectWithLifecycle$7", f = "MatchEventActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class yxu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ MatchEventActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ MatchEventActivity d;

    @c0d(c = "com.sportybet.android.virtual.presentation.activity.MatchEventActivity$setupViewModel$$inlined$collectWithLifecycle$7$1", f = "MatchEventActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ MatchEventActivity d;

        /* JADX INFO: renamed from: yxu$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes5.dex */
        public static final class C1372a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ MatchEventActivity b;

            public C1372a(v5b v5bVar, MatchEventActivity matchEventActivity) {
                this.b = matchEventActivity;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1 */
            /* JADX WARN: Type inference failed for: r0v2 */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v10, types: [androidx.fragment.app.FragmentManager] */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v9 */
            /* JADX WARN: Type inference failed for: r5v0, types: [T] */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                ?? bVar;
                FragmentManager supportFragmentManager;
                MatchEventActivity matchEventActivity = this.b;
                InstantWinPromotionDialogInput instantWinPromotionDialogInput = (InstantWinPromotionDialogInput) t;
                if (instantWinPromotionDialogInput != null) {
                    fio.a.getClass();
                    try {
                        zi50.a aVar = zi50.b;
                        Context contextB = dvi.b(matchEventActivity);
                        e eVar = contextB instanceof e ? (e) contextB : null;
                        if (eVar != null) {
                            supportFragmentManager = eVar.getSupportFragmentManager();
                        } else {
                            bVar = 0;
                        }
                        if ((bVar != 0 ? bVar.H("BasketballPromotionDialog") : null) != null) {
                            bVar = supportFragmentManager;
                            bVar = supportFragmentManager;
                            itf0.a aVar2 = itf0.a;
                            aVar2.q("BasketballPromotionDialog");
                            aVar2.a("a dialog is already on the screen", new Object[0]);
                            bVar = 0;
                        }
                    } catch (Throwable th) {
                        zi50.a aVar3 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                    bVar = supportFragmentManager;
                    bVar = supportFragmentManager;
                    FragmentManager fragmentManager = (FragmentManager) (bVar instanceof zi50.b ? 0 : bVar);
                    if (fragmentManager != null && !fragmentManager.K) {
                        eio eioVar = new eio();
                        eioVar.setArguments(vj5.a(new Pair("ARG_INPUT", instantWinPromotionDialogInput)));
                        eioVar.setCancelable(true);
                        eioVar.show(fragmentManager, "BasketballPromotionDialog");
                    }
                    int i = MatchEventActivity.a0;
                    matchEventActivity.I1().r1();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, MatchEventActivity matchEventActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = matchEventActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1372a c1372a = new C1372a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1372a, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxu(MatchEventActivity matchEventActivity, lyh lyhVar, v1b v1bVar, MatchEventActivity matchEventActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = matchEventActivity;
        this.c = lyhVar;
        this.d = matchEventActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new yxu(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yxu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
