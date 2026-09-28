package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.compose.animation.f;
import androidx.compose.animation.l;
import androidx.compose.animation.u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.luckynumber.placebet.presentation.HowToPlayPresentation;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class f0r {

    public static final /* synthetic */ class a extends saj implements Function1<ler, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ler lerVar) {
            ler lerVar2 = lerVar;
            lerVar2.getClass();
            ((mfr) this.receiver).E1(lerVar2);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$LNPlaceBetContent$2$1", f = "LNPlaceBetContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f2r a;
        public final /* synthetic */ ytw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, f2r f2rVar, ytw ytwVar) {
            super(2, v1bVar);
            this.a = f2rVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(v1bVar, this.a, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.z1(new zxq.f0((lk50) this.b.getValue()));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$LNPlaceBetContent$3$1", f = "LNPlaceBetContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f2r a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f2r f2rVar, boolean z, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = f2rVar;
            this.b = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.z1(new zxq.j0(this.b));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$LNPlaceBetContent$4$1", f = "LNPlaceBetContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ f2r b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, f2r f2rVar, ytw ytwVar) {
            super(2, v1bVar);
            this.a = ytwVar;
            this.b = f2rVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(v1bVar, this.b, this.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            dvq dvqVar = (dvq) this.a.getValue();
            if (dvqVar != null) {
                this.b.z1(new zxq.i0(dvqVar));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$LNPlaceBetContent$5$1", f = "LNPlaceBetContent.kt", l = {172}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ifx b;
        public final /* synthetic */ f2r c;

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$LNPlaceBetContent$5$1$2", f = "LNPlaceBetContent.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ ifx b;
            public final /* synthetic */ f2r c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ifx ifxVar, f2r f2rVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = ifxVar;
                this.c = f2rVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, this.c, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, v1b<? super Unit> v1bVar) {
                return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.a().e("", "key_apply_number");
                this.c.z1(new zxq.b(str));
                return Unit.a;
            }
        }

        public static final class b implements lyh<String> {
            public final /* synthetic */ v340 a;

            @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$LNPlaceBetContent$5$1$invokeSuspend$$inlined$filter$1", f = "LNPlaceBetContent.kt", l = {109}, m = "collect", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: f0r$e$b$b, reason: collision with other inner class name */
            public static final class C0541b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: f0r$e$b$b$a */
                @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$LNPlaceBetContent$5$1$invokeSuspend$$inlined$filter$1$2", f = "LNPlaceBetContent.kt", l = {50}, m = "emit", v = 2)
                public static final class a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0541b.this.emit(null, this);
                    }
                }

                public C0541b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    a aVar;
                    if (v1bVar instanceof a) {
                        aVar = (a) v1bVar;
                        int i = aVar.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            aVar.b = i - Integer.MIN_VALUE;
                        } else {
                            aVar = new a(v1bVar);
                        }
                    } else {
                        aVar = new a(v1bVar);
                    }
                    Object obj2 = aVar.a;
                    y5b y5bVar = y5b.a;
                    int i2 = aVar.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (!StringsKt.U((String) obj)) {
                            aVar.b = 1;
                            if (this.a.emit(obj, aVar) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj2);
                    }
                    return Unit.a;
                }
            }

            public b(v340 v340Var) {
                this.a = v340Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // defpackage.lyh
            public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    C0541b c0541b = new C0541b(myhVar);
                    aVar.b = 1;
                    if (this.a.a.collect(c0541b, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ifx ifxVar, f2r f2rVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = ifxVar;
            this.c = f2rVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ifx ifxVar = this.b;
                b bVar = new b(ifxVar.a().d("", "key_apply_number"));
                a aVar = new a(ifxVar, this.c, null);
                this.a = 1;
                if (kzh.b(bVar, aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$LNPlaceBetContent$6$1", f = "LNPlaceBetContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements gaj<v5b, r0r, v1b<? super Unit>, Object> {
        public /* synthetic */ v5b a;
        public /* synthetic */ r0r b;
        public final /* synthetic */ Function1<nvp, Unit> c;
        public final /* synthetic */ gcr d;
        public final /* synthetic */ mfr e;
        public final /* synthetic */ Context f;
        public final /* synthetic */ v3a0 i;

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$LNPlaceBetContent$6$1$1", f = "LNPlaceBetContent.kt", l = {187}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ v3a0 c;
            public final /* synthetic */ Function1<nvp, Unit> d;
            public final /* synthetic */ r0r e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Context context, v3a0 v3a0Var, Function1<? super nvp, Unit> function1, r0r r0rVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = context;
                this.c = v3a0Var;
                this.d = function1;
                this.e = r0rVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, this.d, this.e, v1bVar);
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
                    Context context = this.b;
                    String strB = sn5.b(context, R.string.page_lucky_numbers__reached_my_numbers_limit_toast, new Object[0]);
                    String strB2 = sn5.b(context, R.string.common_functions__check, new Object[0]);
                    k3a0 k3a0Var = k3a0.a;
                    this.a = 1;
                    v3a0 v3a0Var = this.c;
                    v3a0Var.getClass();
                    obj = v3a0Var.a(new v3a0.b(strB, strB2, false, k3a0Var), this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                int iOrdinal = ((j4a0) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    r0r.c cVar = (r0r.c) this.e;
                    this.d.invoke(new nvp.c(new g1r(cVar.a, cVar.b)));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super nvp, Unit> function1, gcr gcrVar, mfr mfrVar, Context context, v3a0 v3a0Var, v1b<? super f> v1bVar) {
            super(3, v1bVar);
            this.c = function1;
            this.d = gcrVar;
            this.e = mfrVar;
            this.f = context;
            this.i = v3a0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, r0r r0rVar, v1b<? super Unit> v1bVar) {
            Context context = this.f;
            v3a0 v3a0Var = this.i;
            f fVar = new f(this.c, this.d, this.e, context, v3a0Var, v1bVar);
            fVar.a = v5bVar;
            fVar.b = r0rVar;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = this.a;
            r0r r0rVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (r0rVar instanceof r0r.b) {
                this.c.invoke(((r0r.b) r0rVar).a);
            } else {
                boolean zG = Intrinsics.g(r0rVar, r0r.a.a);
                gcr gcrVar = this.d;
                if (zG) {
                    gcrVar.z1(ecr.a.a);
                } else if (r0rVar instanceof r0r.d) {
                    gcrVar.z1(new ecr.b(((r0r.d) r0rVar).a));
                } else if (r0rVar instanceof r0r.c) {
                    ej5.c(v5bVar, null, null, new a(this.f, this.i, this.c, r0rVar, null), 3);
                } else {
                    if (!(r0rVar instanceof r0r.e)) {
                        uhc.a();
                        return null;
                    }
                    this.e.E1(new ler.i(((r0r.e) r0rVar).a));
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class g extends saj implements Function1<zxq, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(zxq zxqVar) {
            zxq zxqVar2 = zxqVar;
            zxqVar2.getClass();
            ((f2r) this.receiver).z1(zxqVar2);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class h extends saj implements Function1<ler, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ler lerVar) {
            ler lerVar2 = lerVar;
            lerVar2.getClass();
            ((mfr) this.receiver).E1(lerVar2);
            return Unit.a;
        }
    }

    public static final class i implements tse {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Activity b;

        public i(Activity activity, boolean z) {
            this.a = z;
            this.b = activity;
        }

        @Override // defpackage.tse
        public final void dispose() {
            Activity activity;
            if (!this.a || (activity = this.b) == null) {
                return;
            }
            f0r.j(activity);
        }
    }

    public static final class j implements tse {
        public final /* synthetic */ ibs a;
        public final /* synthetic */ oyq b;

        public j(ibs ibsVar, oyq oyqVar) {
            this.a = ibsVar;
            this.b = oyqVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.getLifecycle().d(this.b);
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$ListContent$1$1", f = "LNPlaceBetContent.kt", l = {796}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ zzr c;
        public final /* synthetic */ yyp d;
        public final /* synthetic */ ytw<String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, zzr zzrVar, yyp yypVar, ytw<String> ytwVar, v1b<? super k> v1bVar) {
            super(2, v1bVar);
            this.b = str;
            this.c = zzrVar;
            this.d = yypVar;
            this.e = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new k(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ytw<String> ytwVar = this.e;
                String value = ytwVar.getValue();
                String str = this.b;
                ytwVar.setValue(str);
                if (value != null && str != null && !value.equals(str)) {
                    this.a = 1;
                    if (f0r.k(this.c, 1, this.d, this) == y5bVar) {
                        return y5bVar;
                    }
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

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$MainDrawDialog$2$1$1$1", f = "LNPlaceBetContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ e0q a;
        public final /* synthetic */ ytw<e0q.a> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(e0q e0qVar, ytw<e0q.a> ytwVar, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.a = e0qVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new l(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            e0q e0qVar = this.a;
            if (e0qVar instanceof e0q.a) {
                this.b.setValue((e0q.a) e0qVar);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$PageContent$2$1$1$5$2$2$1$1", f = "LNPlaceBetContent.kt", l = {449}, m = "invokeSuspend", v = 2)
    public static final class m extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ yyp c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(zzr zzrVar, yyp yypVar, v1b<? super m> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = yypVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new m(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((m) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (f0r.l(this.b, this.c, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$PageContent$2$1$1$5$2$listActionHandler$1$1$1", f = "LNPlaceBetContent.kt", l = {419}, m = "invokeSuspend", v = 2)
    public static final class n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ yyp c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(zzr zzrVar, yyp yypVar, v1b<? super n> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = yypVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new n(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (f0r.k(this.b, 1, this.c, this) == y5bVar) {
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

    public static final class o implements Function1<rkd0, Unit> {
        public final /* synthetic */ Function1<zxq, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public o(Function1<? super zxq, Unit> function1) {
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(rkd0 rkd0Var) {
            BigDecimal bigDecimal = rkd0Var.a;
            bigDecimal.getClass();
            this.a.invoke(new zxq.s(bigDecimal));
            return Unit.a;
        }
    }

    public static final void a(final androidx.compose.ui.d dVar, final k0r.c cVar, final boolean z, final Function1<? super zxq, Unit> function1, androidx.compose.runtime.a aVar, final int i2) {
        long j2;
        androidx.compose.runtime.b bVarI = aVar.i(-870383335);
        int i3 = i2 | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(cVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            i060 i060VarE = j060.e(0.0f, 100.0f, 100.0f, 0.0f, 9);
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.h.h(androidx.compose.foundation.layout.j.i(dVar, 40.0f), 12.0f, 0.0f, 2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = androidx.compose.foundation.layout.j.e(androidx.compose.foundation.layout.h.j(aVar3, 0.0f, 0.0f, 40.0f, 0.0f, 11), 1.0f);
            qcn<usq> qcnVar = cVar.b;
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new dl3(function1, 1);
                bVarI.r(objY);
            }
            egq.b(dVarE, qcnVar, (Function1) objY, bVarI, 6);
            androidx.compose.ui.d dVarA = ls7.a(androidx.compose.foundation.layout.j.r(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.f), 40.0f), i060VarE);
            qyd0 qyd0Var = oib0.a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarA, ((lib0) bVarI.O(qyd0Var)).g1, zk40.a);
            boolean z3 = i4 == 2048;
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: xzq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(new zxq.w(true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.h.f(androidx.compose.foundation.d.d(dVarB, false, null, null, mla.d((Function0) objY2, bVarI, 0), 15), 10.0f);
            crz crzVarA = erz.a(R.drawable.ic__feature__statistic, 0, bVarI);
            if (z) {
                bVarI.N(-917977212);
                j2 = ((lib0) bVarI.O(qyd0Var)).R;
                bVarI.X(false);
            } else {
                bVarI.N(-917908950);
                j2 = ((lib0) bVarI.O(qyd0Var)).o;
                bVarI.X(false);
            }
            h6n.b(crzVarA, "draw_result", dVarF, j2, bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(cVar, z, function1, i2) { // from class: yzq
                public final /* synthetic */ k0r.c b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    f0r.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0168  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final ifx ifxVar, final yfx yfxVar, final gcr gcrVar, final Function1<? super nvp, Unit> function1, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        HowToPlayPresentation howToPlayPresentation;
        Object fVar;
        com.sportybet.feature.luckynumber.placebet.presentation.a aVar2;
        gcrVar.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(759667697);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.A(ifxVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(yfxVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? bVarI.M(gcrVar) : bVarI.A(gcrVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            f2r f2rVar = (f2r) p8i0.a(jq40.a(f2r.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            w8i0 w8i0VarA2 = zdt.a(bVarI);
            if (w8i0VarA2 == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            mfr mfrVar = (mfr) p8i0.a(jq40.a(mfr.class), w8i0VarA2, null, cll.a(w8i0VarA2, bVarI), w8i0VarA2 instanceof iel ? ((iel) w8i0VarA2).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            ytw ytwVarC = wyh.c(gcrVar.y, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(gcrVar.z, bVarI, 0, 7);
            ytw ytwVarC3 = wyh.c(f2rVar.l0, bVarI, 0, 7);
            ytw ytwVarC4 = wyh.c(mfrVar.b0, bVarI, 0, 7);
            ytw ytwVarA = n95.a(e1i.a(yfxVar.b.A), null, null, bVarI, 48, 2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = b40.a(bVarI);
            }
            v3a0 v3a0Var = (v3a0) objY;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            mhr mhrVar = (mhr) ytwVarC4.getValue();
            z3r z3rVar = mhrVar != null ? mhrVar.d : null;
            z3r.b bVar = z3rVar instanceof z3r.b ? (z3r.b) z3rVar : null;
            boolean z = bVar != null && bVar.d;
            ifx ifxVar2 = (ifx) ytwVarA.getValue();
            if (ifxVar2 != null) {
                int i4 = ygx.f;
                ygx ygxVar = ifxVar2.b;
                dq7 dq7VarA = jq40.a(com.sportybet.feature.luckynumber.placebet.presentation.a.class);
                ygxVar.getClass();
                if (w060.b(ue80.b(dq7VarA)) != ygxVar.b.e) {
                    ifxVar2 = null;
                }
                if (ifxVar2 == null || (aVar2 = (com.sportybet.feature.luckynumber.placebet.presentation.a) mfx.a(ifxVar2, jq40.a(com.sportybet.feature.luckynumber.placebet.presentation.a.class))) == null) {
                    howToPlayPresentation = null;
                } else {
                    howToPlayPresentation = aVar2.b;
                }
            } else {
                howToPlayPresentation = null;
            }
            boolean z2 = howToPlayPresentation == HowToPlayPresentation.MAIN_DRAW_DIALOG;
            boolean zA = bVarI.A(mfrVar);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new a(1, mfrVar, mfr.class, "handleAction", "handleAction(Lcom/sportybet/feature/luckynumber/placebet/presentation/stream/LNStreamAction;)V", 0);
                bVarI.r(objY2);
            }
            d((Function1) ((chp) objY2), bVarI, 0);
            lk50 lk50Var = (lk50) ytwVarC.getValue();
            boolean zA2 = bVarI.A(f2rVar) | bVarI.M(ytwVarC);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new b(null, f2rVar, ytwVarC);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, lk50Var, (Function2) objY3);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA3 = bVarI.A(f2rVar) | bVarI.b(z);
            Object objY4 = bVarI.y();
            if (zA3 || objY4 == c0042a) {
                objY4 = new c(f2rVar, z, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY4);
            dvq dvqVar = (dvq) ytwVarC2.getValue();
            boolean zM = bVarI.M(ytwVarC2) | bVarI.A(f2rVar);
            Object objY5 = bVarI.y();
            if (zM || objY5 == c0042a) {
                objY5 = new d(null, f2rVar, ytwVarC2);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, dvqVar, (Function2) objY5);
            boolean zA4 = bVarI.A(ifxVar) | bVarI.A(f2rVar);
            Object objY6 = bVarI.y();
            if (zA4 || objY6 == c0042a) {
                objY6 = new e(ifxVar, f2rVar, null);
                bVarI.r(objY6);
            }
            xvf.e(bVarI, ifxVar, (Function2) objY6);
            ku90<r0r> ku90Var = f2rVar.m0;
            boolean zA5 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && bVarI.A(gcrVar))) | bVarI.A(context) | bVarI.A(mfrVar);
            Object objY7 = bVarI.y();
            if (zA5 || objY7 == c0042a) {
                fVar = new f(function1, gcrVar, mfrVar, context, v3a0Var, null);
                bVarI.r(fVar);
            } else {
                fVar = objY7;
            }
            abs.b(ku90Var, null, null, (gaj) fVar, bVarI, 0);
            t1r t1rVar = (t1r) ytwVarC3.getValue();
            mhr mhrVar2 = (mhr) ytwVarC4.getValue();
            boolean zA6 = bVarI.A(f2rVar);
            Object objY8 = bVarI.y();
            if (zA6 || objY8 == c0042a) {
                objY8 = new g(1, f2rVar, f2r.class, "handleAction", "handleAction(Lcom/sportybet/feature/luckynumber/placebet/presentation/LNPlaceBetAction;)V", 0);
                bVarI.r(objY8);
            }
            Function1 function2 = (Function1) ((chp) objY8);
            boolean zA7 = bVarI.A(mfrVar);
            Object objY9 = bVarI.y();
            if (zA7 || objY9 == c0042a) {
                objY9 = new h(1, mfrVar, mfr.class, "handleAction", "handleAction(Lcom/sportybet/feature/luckynumber/placebet/presentation/stream/LNStreamAction;)V", 0);
                bVarI.r(objY9);
            }
            i(t1rVar, mhrVar2, v3a0Var, z2, function2, (Function1) ((chp) objY9), bVarI, 448, 0);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: c0r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f0r.b(ifxVar, yfxVar, gcrVar, function1, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final boolean z, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(-1141508697);
        int i3 = (bVarI.b(z) ? 4 : 2) | i2;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            final Activity activityB = wc.b((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = bVarI.A(activityB) | ((i3 & 14) == 4);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: pyq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        n8j0.g cVar;
                        ((use) obj).getClass();
                        boolean z2 = z;
                        Activity activity = activityB;
                        if (z2) {
                            if (activity != null) {
                                activity.getWindow().getDecorView().setSystemUiVisibility(4102);
                                Window window = activity.getWindow();
                                qoa0 qoa0Var = new qoa0(activity.getWindow().getDecorView());
                                int i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 35) {
                                    cVar = new n8j0.f(window, qoa0Var);
                                } else if (i4 >= 30) {
                                    cVar = new n8j0.d(window, qoa0Var);
                                } else {
                                    cVar = i4 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
                                }
                                cVar.a(519);
                                cVar.e();
                                try {
                                    zi50.a aVar2 = zi50.b;
                                    activity.setRequestedOrientation(0);
                                    Unit unit = Unit.a;
                                } catch (Throwable unused) {
                                    zi50.a aVar3 = zi50.b;
                                }
                            }
                        } else if (activity != null) {
                            f0r.j(activity);
                        }
                        return new f0r.i(activity, z2);
                    }
                };
                bVarI.r(objY);
            }
            xvf.a(activityB, boolValueOf, (Function1) objY, bVarI);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, z) { // from class: qyq
                public final /* synthetic */ boolean a;

                {
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    f0r.c(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final Function1<? super ler, Unit> function1, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(-1706286840);
        int i3 = (bVarI.A(function1) ? 4 : 2) | i2;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            final ytw ytwVarC = androidx.compose.runtime.m.c(function1, bVarI);
            final Activity activityB = wc.b((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            boolean zA = bVarI.A(activityB) | bVarI.M(ytwVarC) | bVarI.A(ibsVar);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: hyq
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [hbs, oyq] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        final Activity activity = activityB;
                        final ytw ytwVar = ytwVarC;
                        ?? r3 = new cbs() { // from class: oyq
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                if (aVar2 == s9s.a.ON_STOP) {
                                    Activity activity2 = activity;
                                    if (activity2 == null || !activity2.isChangingConfigurations()) {
                                        ((Function1) ytwVar.getValue()).invoke(ler.c.a);
                                    }
                                }
                            }
                        };
                        ibs ibsVar2 = ibsVar;
                        ibsVar2.getLifecycle().a(r3);
                        return new f0r.j(ibsVar2, r3);
                    }
                };
                bVarI.r(objY);
            }
            xvf.a(ibsVar, activityB, (Function1) objY, bVarI);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, function1) { // from class: iyq
                public final /* synthetic */ Function1 a;

                {
                    this.a = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    f0r.d(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final androidx.compose.ui.d dVar, final androidx.compose.animation.l lVar, final float f2, final boolean z, final k0r.c cVar, final mhr mhrVar, final zzr zzrVar, final Function1<? super zxq, Unit> function1, final Function1<? super ler, Unit> function2, final yyp yypVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        yyp yypVar2;
        androidx.compose.runtime.b bVar;
        usq next;
        Object kVar;
        String str;
        androidx.compose.runtime.b bVarI = aVar.i(469763634);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(lVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.c(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.M(cVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (262144 & i2) == 0 ? bVarI.M(mhrVar) : bVarI.A(mhrVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.M(zzrVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= bVarI.A(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= bVarI.A(function2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            yypVar2 = yypVar;
            i3 |= bVarI.M(yypVar2) ? 536870912 : 268435456;
        } else {
            yypVar2 = yypVar;
        }
        if (bVarI.q(i3 & 1, (i3 & 306783379) != 306783378)) {
            final qcn<zsq> qcnVar = cVar.c;
            Iterator<usq> it = cVar.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.c);
            usq usqVar = next;
            String str2 = usqVar != null ? usqVar.a : null;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = androidx.compose.runtime.m.b(str2);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            String str3 = str2;
            boolean zM = bVarI.M(str2) | ((i3 & 3670016) == 1048576) | ((1879048192 & i3) == 536870912);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                kVar = new k(str3, zzrVar, yypVar2, ytwVar, null);
                str = str3;
                bVarI.r(kVar);
            } else {
                kVar = objY2;
                str = str3;
            }
            xvf.e(bVarI, str, (Function2) kVar);
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.j.g(dVar, 1.0f), ((lib0) bVarI.O(oib0.a)).q0, zk40.a);
            umz umzVarB = androidx.compose.foundation.layout.h.b(0.0f, 0.0f, 0.0f, 24.0f, 7);
            glq glqVar = cVar.a.h;
            op8 op8VarB = pp8.b(1168885104, new Function2() { // from class: rzq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        mhr mhrVar2 = mhrVar;
                        if (mhrVar2 == null) {
                            aVar2.N(-1338669719);
                            aVar2.H();
                        } else {
                            aVar2.N(-1338669718);
                            efr.b(mhrVar2, function2, aVar2, 392);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            op8 op8VarB2 = pp8.b(1247006193, new Function2() { // from class: szq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        hsq hsqVar = cVar.a;
                        final Function1 function3 = function1;
                        boolean zM2 = aVar2.M(function3);
                        Object objY3 = aVar2.y();
                        if (zM2 || objY3 == a.C0041a.a) {
                            objY3 = new Function0() { // from class: zzq
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function3.invoke(new zxq.v(true));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY3);
                        }
                        f0r.g(hsqVar, null, (Function0) objY3, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            op8 op8VarB3 = pp8.b(1325127282, new Function2() { // from class: tzq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        f0r.a(h.j(j.g(d.a.b, 1.0f), 0.0f, 0.0f, 0.0f, ((cjb0) aVar2.O(ejb0.a)).e, 7), cVar, z, function1, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            boolean zM2 = ((i3 & 112) == 32) | bVarI.M(qcnVar) | ((29360128 & i3) == 8388608);
            Object objY3 = bVarI.y();
            if (zM2 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: uzq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        qcn<zsq> qcnVar2 = qcnVar;
                        qcnVar2.getClass();
                        final Function1 function3 = function1;
                        function3.getClass();
                        for (zsq zsqVar : qcnVar2) {
                            if (!Intrinsics.g(zsqVar, zsq.a.a)) {
                                boolean z2 = zsqVar instanceof zsq.f;
                                final l lVar2 = lVar;
                                if (z2) {
                                    final zsq.f fVar = (zsq.f) zsqVar;
                                    szrVar.i(inm.a("main_draw_panel_", fVar.b), "main_bet_panel", new op8(1710222039, new gaj() { // from class: op60
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            a aVar2 = (a) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((gwr) obj2).getClass();
                                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                Object objY4 = aVar2.y();
                                                if (objY4 == a.C0041a.a) {
                                                    objY4 = k.a(0);
                                                    aVar2.r(objY4);
                                                }
                                                final osw oswVar = (osw) objY4;
                                                d dVarK = j.k(j.g(h.h(d.a.b, ((cjb0) aVar2.O(ejb0.a)).e, 0.0f, 2), 1.0f), mla.f(oswVar.D(), aVar2), 0.0f, 2);
                                                aiv aivVarC = g75.c(ht.a.a, false);
                                                int iHashCode = Long.hashCode(aVar2.m());
                                                ne00 ne00VarO = aVar2.o();
                                                d dVarC = c.c(aVar2, dVarK);
                                                yka.k.getClass();
                                                tsr.a aVar3 = yka.a.b;
                                                if (aVar2.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar2.D();
                                                if (aVar2.g()) {
                                                    aVar2.F(aVar3);
                                                } else {
                                                    aVar2.p();
                                                }
                                                hlh0.a(aVar2, aivVarC, yka.a.f);
                                                hlh0.a(aVar2, ne00VarO, yka.a.e);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                                }
                                                hlh0.a(aVar2, dVarC, yka.a.d);
                                                final zsq.f fVar2 = fVar;
                                                boolean z3 = fVar2.h;
                                                t9g t9gVarF = f.f(null, 3);
                                                owg owgVarG = f.g(null, 3);
                                                final l lVar3 = lVar2;
                                                final Function1 function4 = function3;
                                                hh0.e(z3, null, t9gVarF, owgVarG, null, pp8.b(-1875990731, new gaj() { // from class: pp60
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        jh0 jh0Var = (jh0) obj5;
                                                        a aVar4 = (a) obj6;
                                                        int iIntValue2 = ((Integer) obj7).intValue();
                                                        jh0Var.getClass();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar4.M(jh0Var) : aVar4.A(jh0Var) ? 4 : 2;
                                                        }
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            Object objY5 = aVar4.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (objY5 == c0042a2) {
                                                                objY5 = new qp60(oswVar, 0);
                                                                aVar4.r(objY5);
                                                            }
                                                            d dVarJ = h.j(w.a(d.a.b, (Function1) objY5), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                                            final zsq.f fVar3 = fVar2;
                                                            String str4 = fVar3.b;
                                                            boolean z4 = fVar3.e;
                                                            boolean z5 = fVar3.d;
                                                            qcn<kxq> qcnVar3 = fVar3.f;
                                                            q4r q4rVar = fVar3.g;
                                                            int i4 = iIntValue2;
                                                            String str5 = fVar3.a;
                                                            boolean zB = fVar3.b();
                                                            final Function1 function5 = function4;
                                                            boolean zM3 = aVar4.M(function5);
                                                            Object objY6 = aVar4.y();
                                                            if (zM3 || objY6 == c0042a2) {
                                                                objY6 = new Function1() { // from class: rp60
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj8) {
                                                                        function5.invoke(new jp60.c(((Boolean) obj8).booleanValue()));
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY6);
                                                            }
                                                            Function1 function6 = (Function1) objY6;
                                                            boolean zM4 = aVar4.M(function5) | aVar4.M(fVar3);
                                                            Object objY7 = aVar4.y();
                                                            if (zM4 || objY7 == c0042a2) {
                                                                objY7 = new Function1() { // from class: sp60
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj8) {
                                                                        function5.invoke(new ip60.c(fVar3.b, ((Integer) obj8).intValue()));
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY7);
                                                            }
                                                            Function1 function7 = (Function1) objY7;
                                                            boolean zM5 = aVar4.M(function5);
                                                            Object objY8 = aVar4.y();
                                                            if (zM5 || objY8 == c0042a2) {
                                                                objY8 = new sut(1, function5);
                                                                aVar4.r(objY8);
                                                            }
                                                            Function1 function8 = (Function1) objY8;
                                                            boolean zM6 = aVar4.M(function5);
                                                            Object objY9 = aVar4.y();
                                                            if (zM6 || objY9 == c0042a2) {
                                                                objY9 = new vey(function5, 1);
                                                                aVar4.r(objY9);
                                                            }
                                                            Function1 function9 = (Function1) objY9;
                                                            boolean zM7 = aVar4.M(function5);
                                                            Object objY10 = aVar4.y();
                                                            if (zM7 || objY10 == c0042a2) {
                                                                objY10 = new wey(function5, 1);
                                                                aVar4.r(objY10);
                                                            }
                                                            Function1 function10 = (Function1) objY10;
                                                            boolean zM8 = aVar4.M(function5) | aVar4.M(fVar3);
                                                            Object objY11 = aVar4.y();
                                                            if (zM8 || objY11 == c0042a2) {
                                                                objY11 = new tp60(0, fVar3, function5);
                                                                aVar4.r(objY11);
                                                            }
                                                            Function0 function0 = (Function0) objY11;
                                                            boolean zM9 = aVar4.M(function5) | aVar4.M(fVar3);
                                                            Object objY12 = aVar4.y();
                                                            if (zM9 || objY12 == c0042a2) {
                                                                objY12 = new wut(1, fVar3, function5);
                                                                aVar4.r(objY12);
                                                            }
                                                            rsq.a(dVarJ, str4, str5, lVar3, jh0Var, z5, z4, zB, q4rVar, qcnVar3, null, function6, function7, function8, function9, function10, function0, (Function0) objY12, aVar4, ((i4 << 12) & 57344) | 6, 1024);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar2), aVar2, 200064, 18);
                                                aVar2.s();
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                } else if (zsqVar instanceof zsq.e) {
                                    final zsq.e eVar = (zsq.e) zsqVar;
                                    szrVar.i(inm.a("main_draw_panel_", eVar.b), "main_bet_panel", new op8(269354401, new gaj() { // from class: no60
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            a aVar2 = (a) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((gwr) obj2).getClass();
                                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                Object objY4 = aVar2.y();
                                                if (objY4 == a.C0041a.a) {
                                                    objY4 = k.a(0);
                                                    aVar2.r(objY4);
                                                }
                                                final osw oswVar = (osw) objY4;
                                                d dVarK = j.k(j.g(h.h(d.a.b, ((cjb0) aVar2.O(ejb0.a)).e, 0.0f, 2), 1.0f), mla.f(oswVar.D(), aVar2), 0.0f, 2);
                                                aiv aivVarC = g75.c(ht.a.a, false);
                                                int iHashCode = Long.hashCode(aVar2.m());
                                                ne00 ne00VarO = aVar2.o();
                                                d dVarC = c.c(aVar2, dVarK);
                                                yka.k.getClass();
                                                tsr.a aVar3 = yka.a.b;
                                                if (aVar2.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar2.D();
                                                if (aVar2.g()) {
                                                    aVar2.F(aVar3);
                                                } else {
                                                    aVar2.p();
                                                }
                                                hlh0.a(aVar2, aivVarC, yka.a.f);
                                                hlh0.a(aVar2, ne00VarO, yka.a.e);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                                }
                                                hlh0.a(aVar2, dVarC, yka.a.d);
                                                final zsq.e eVar2 = eVar;
                                                boolean z3 = eVar2.g;
                                                t9g t9gVarF = f.f(null, 3);
                                                owg owgVarG = f.g(null, 3);
                                                final l lVar3 = lVar2;
                                                final Function1 function4 = function3;
                                                hh0.e(z3, null, t9gVarF, owgVarG, null, pp8.b(978108927, new gaj() { // from class: oo60
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        jh0 jh0Var = (jh0) obj5;
                                                        a aVar4 = (a) obj6;
                                                        int iIntValue2 = ((Integer) obj7).intValue();
                                                        jh0Var.getClass();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar4.M(jh0Var) : aVar4.A(jh0Var) ? 4 : 2;
                                                        }
                                                        int i4 = 0;
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            Object objY5 = aVar4.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (objY5 == c0042a2) {
                                                                objY5 = new po60(oswVar, i4);
                                                                aVar4.r(objY5);
                                                            }
                                                            d dVarJ = h.j(w.a(d.a.b, (Function1) objY5), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                                            final zsq.e eVar3 = eVar2;
                                                            String str4 = eVar3.b;
                                                            boolean z4 = eVar3.e;
                                                            boolean z5 = eVar3.d;
                                                            qcn<kxq> qcnVar3 = eVar3.f;
                                                            int i5 = iIntValue2;
                                                            String str5 = eVar3.a;
                                                            boolean zB = eVar3.b();
                                                            final Function1 function5 = function4;
                                                            boolean zM3 = aVar4.M(function5);
                                                            Object objY6 = aVar4.y();
                                                            if (zM3 || objY6 == c0042a2) {
                                                                objY6 = new Function1() { // from class: qo60
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj8) {
                                                                        zxq zxqVar = (zxq) obj8;
                                                                        zxqVar.getClass();
                                                                        function5.invoke(zxqVar);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY6);
                                                            }
                                                            Function1 function6 = (Function1) objY6;
                                                            boolean zM4 = aVar4.M(function5);
                                                            Object objY7 = aVar4.y();
                                                            if (zM4 || objY7 == c0042a2) {
                                                                objY7 = new yxj(1, function5);
                                                                aVar4.r(objY7);
                                                            }
                                                            Function1 function7 = (Function1) objY7;
                                                            boolean zM5 = aVar4.M(function5);
                                                            Object objY8 = aVar4.y();
                                                            if (zM5 || objY8 == c0042a2) {
                                                                objY8 = new Function1() { // from class: ro60
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj8) {
                                                                        function5.invoke(new io60.a(((Boolean) obj8).booleanValue()));
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY8);
                                                            }
                                                            Function1 function8 = (Function1) objY8;
                                                            boolean zM6 = aVar4.M(function5) | aVar4.M(eVar3);
                                                            Object objY9 = aVar4.y();
                                                            if (zM6 || objY9 == c0042a2) {
                                                                objY9 = new Function0() { // from class: so60
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        function5.invoke(new zxq.z(eVar3.b));
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY9);
                                                            }
                                                            Function0 function0 = (Function0) objY9;
                                                            boolean zM7 = aVar4.M(function5) | aVar4.M(eVar3);
                                                            Object objY10 = aVar4.y();
                                                            if (zM7 || objY10 == c0042a2) {
                                                                objY10 = new Function0() { // from class: to60
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        function5.invoke(new zxq.l(eVar3.c));
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY10);
                                                            }
                                                            rsq.a(dVarJ, str4, str5, lVar3, jh0Var, z5, z4, zB, null, qcnVar3, null, null, null, function6, function7, function8, function0, (Function0) objY10, aVar4, ((i5 << 12) & 57344) | 6, 7424);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar2), aVar2, 200064, 18);
                                                aVar2.s();
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                } else if (zsqVar instanceof zsq.g) {
                                    final zsq.g gVar = (zsq.g) zsqVar;
                                    szrVar.i(inm.a("main_draw_panel_", gVar.b), "main_bet_panel", new op8(667571893, new gaj() { // from class: bp60
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            a aVar2 = (a) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((gwr) obj2).getClass();
                                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                Object objY4 = aVar2.y();
                                                if (objY4 == a.C0041a.a) {
                                                    objY4 = k.a(0);
                                                    aVar2.r(objY4);
                                                }
                                                final osw oswVar = (osw) objY4;
                                                d dVarK = j.k(j.g(h.h(d.a.b, ((cjb0) aVar2.O(ejb0.a)).e, 0.0f, 2), 1.0f), mla.f(oswVar.D(), aVar2), 0.0f, 2);
                                                aiv aivVarC = g75.c(ht.a.a, false);
                                                int iHashCode = Long.hashCode(aVar2.m());
                                                ne00 ne00VarO = aVar2.o();
                                                d dVarC = c.c(aVar2, dVarK);
                                                yka.k.getClass();
                                                tsr.a aVar3 = yka.a.b;
                                                if (aVar2.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar2.D();
                                                if (aVar2.g()) {
                                                    aVar2.F(aVar3);
                                                } else {
                                                    aVar2.p();
                                                }
                                                hlh0.a(aVar2, aivVarC, yka.a.f);
                                                hlh0.a(aVar2, ne00VarO, yka.a.e);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                                }
                                                hlh0.a(aVar2, dVarC, yka.a.d);
                                                final zsq.g gVar2 = gVar;
                                                boolean z3 = gVar2.i;
                                                t9g t9gVarF = f.f(null, 3);
                                                owg owgVarG = f.g(null, 3);
                                                final l lVar3 = lVar2;
                                                final Function1 function4 = function3;
                                                hh0.e(z3, null, t9gVarF, owgVarG, null, pp8.b(-424815341, new gaj() { // from class: cp60
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        jh0 jh0Var = (jh0) obj5;
                                                        a aVar4 = (a) obj6;
                                                        int iIntValue2 = ((Integer) obj7).intValue();
                                                        jh0Var.getClass();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar4.M(jh0Var) : aVar4.A(jh0Var) ? 4 : 2;
                                                        }
                                                        int i4 = 0;
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            Object objY5 = aVar4.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (objY5 == c0042a2) {
                                                                objY5 = new dp60(oswVar, i4);
                                                                aVar4.r(objY5);
                                                            }
                                                            d dVarJ = h.j(w.a(d.a.b, (Function1) objY5), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                                            final zsq.g gVar3 = gVar2;
                                                            String str4 = gVar3.b;
                                                            boolean z4 = gVar3.e;
                                                            boolean z5 = gVar3.d;
                                                            qcn<kxq> qcnVar3 = gVar3.f;
                                                            qcn<kxq> qcnVar4 = gVar3.g;
                                                            q4r q4rVar = gVar3.h;
                                                            int i5 = iIntValue2;
                                                            String str5 = gVar3.a;
                                                            boolean zB = gVar3.b();
                                                            final Function1 function5 = function4;
                                                            boolean zM3 = aVar4.M(function5);
                                                            Object objY6 = aVar4.y();
                                                            if (zM3 || objY6 == c0042a2) {
                                                                objY6 = new ep60(function5, 0);
                                                                aVar4.r(objY6);
                                                            }
                                                            Function1 function6 = (Function1) objY6;
                                                            boolean zM4 = aVar4.M(function5) | aVar4.M(gVar3);
                                                            Object objY7 = aVar4.y();
                                                            if (zM4 || objY7 == c0042a2) {
                                                                objY7 = new Function1() { // from class: fp60
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj8) {
                                                                        function5.invoke(new uo60.c(gVar3.b, ((Integer) obj8).intValue()));
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY7);
                                                            }
                                                            Function1 function7 = (Function1) objY7;
                                                            boolean zM5 = aVar4.M(function5);
                                                            Object objY8 = aVar4.y();
                                                            if (zM5 || objY8 == c0042a2) {
                                                                objY8 = new gp60(function5, 0);
                                                                aVar4.r(objY8);
                                                            }
                                                            Function1 function8 = (Function1) objY8;
                                                            boolean zM6 = aVar4.M(function5);
                                                            Object objY9 = aVar4.y();
                                                            if (zM6 || objY9 == c0042a2) {
                                                                objY9 = new hp60(function5, 0);
                                                                aVar4.r(objY9);
                                                            }
                                                            Function1 function9 = (Function1) objY9;
                                                            boolean zM7 = aVar4.M(function5);
                                                            Object objY10 = aVar4.y();
                                                            if (zM7 || objY10 == c0042a2) {
                                                                objY10 = new av6(function5, 1);
                                                                aVar4.r(objY10);
                                                            }
                                                            Function1 function10 = (Function1) objY10;
                                                            boolean zM8 = aVar4.M(function5) | aVar4.M(gVar3);
                                                            Object objY11 = aVar4.y();
                                                            if (zM8 || objY11 == c0042a2) {
                                                                objY11 = new uyj(1, function5, gVar3);
                                                                aVar4.r(objY11);
                                                            }
                                                            Function0 function0 = (Function0) objY11;
                                                            boolean zM9 = aVar4.M(function5) | aVar4.M(gVar3);
                                                            Object objY12 = aVar4.y();
                                                            if (zM9 || objY12 == c0042a2) {
                                                                objY12 = new vyj(function5, gVar3);
                                                                aVar4.r(objY12);
                                                            }
                                                            rsq.a(dVarJ, str4, str5, lVar3, jh0Var, z5, z4, zB, q4rVar, qcnVar3, qcnVar4, function6, function7, function8, function9, function10, function0, (Function0) objY12, aVar4, ((i5 << 12) & 57344) | 6, 0);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar2), aVar2, 200064, 18);
                                                aVar2.s();
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                } else if (zsqVar instanceof zsq.d) {
                                    final zsq.d dVar2 = (zsq.d) zsqVar;
                                    szrVar.i(inm.a("main_draw_panel_", dVar2.b), "main_bet_panel", new op8(982771529, new gaj() { // from class: eh60
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            a aVar2 = (a) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((gwr) obj2).getClass();
                                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                Object objY4 = aVar2.y();
                                                if (objY4 == a.C0041a.a) {
                                                    objY4 = k.a(0);
                                                    aVar2.r(objY4);
                                                }
                                                final osw oswVar = (osw) objY4;
                                                d dVarK = j.k(j.g(h.h(d.a.b, ((cjb0) aVar2.O(ejb0.a)).e, 0.0f, 2), 1.0f), mla.f(oswVar.D(), aVar2), 0.0f, 2);
                                                aiv aivVarC = g75.c(ht.a.a, false);
                                                int iHashCode = Long.hashCode(aVar2.m());
                                                ne00 ne00VarO = aVar2.o();
                                                d dVarC = c.c(aVar2, dVarK);
                                                yka.k.getClass();
                                                tsr.a aVar3 = yka.a.b;
                                                if (aVar2.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar2.D();
                                                if (aVar2.g()) {
                                                    aVar2.F(aVar3);
                                                } else {
                                                    aVar2.p();
                                                }
                                                hlh0.a(aVar2, aivVarC, yka.a.f);
                                                hlh0.a(aVar2, ne00VarO, yka.a.e);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                                }
                                                hlh0.a(aVar2, dVarC, yka.a.d);
                                                final zsq.d dVar3 = dVar2;
                                                boolean z3 = dVar3.g;
                                                t9g t9gVarF = f.f(null, 3);
                                                owg owgVarG = f.g(null, 3);
                                                final l lVar3 = lVar2;
                                                final Function1 function4 = function3;
                                                hh0.e(z3, null, t9gVarF, owgVarG, null, pp8.b(1691526055, new gaj() { // from class: fh60
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        jh0 jh0Var = (jh0) obj5;
                                                        a aVar4 = (a) obj6;
                                                        int iIntValue2 = ((Integer) obj7).intValue();
                                                        jh0Var.getClass();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar4.M(jh0Var) : aVar4.A(jh0Var) ? 4 : 2;
                                                        }
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            Object objY5 = aVar4.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (objY5 == c0042a2) {
                                                                final osw oswVar2 = oswVar;
                                                                objY5 = new Function1() { // from class: gh60
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj8) {
                                                                        oswVar2.k((int) (((jxo) obj8).a & 4294967295L));
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY5);
                                                            }
                                                            d dVarJ = h.j(w.a(d.a.b, (Function1) objY5), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                                            zsq.d dVar4 = dVar3;
                                                            String str4 = dVar4.b;
                                                            boolean z4 = dVar4.e;
                                                            boolean z5 = dVar4.d;
                                                            qcn<kxq> qcnVar3 = dVar4.f;
                                                            int i4 = iIntValue2;
                                                            String str5 = dVar4.a;
                                                            boolean zB = dVar4.b();
                                                            final Function1 function5 = function4;
                                                            boolean zM3 = aVar4.M(function5);
                                                            Object objY6 = aVar4.y();
                                                            if (zM3 || objY6 == c0042a2) {
                                                                objY6 = new x520(function5, 1);
                                                                aVar4.r(objY6);
                                                            }
                                                            Function1 function6 = (Function1) objY6;
                                                            boolean zM4 = aVar4.M(function5);
                                                            Object objY7 = aVar4.y();
                                                            if (zM4 || objY7 == c0042a2) {
                                                                objY7 = new Function1() { // from class: hh60
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj8) {
                                                                        function5.invoke(new zg60.b(((Boolean) obj8).booleanValue()));
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY7);
                                                            }
                                                            Function1 function7 = (Function1) objY7;
                                                            boolean zM5 = aVar4.M(function5);
                                                            Object objY8 = aVar4.y();
                                                            if (zM5 || objY8 == c0042a2) {
                                                                objY8 = new Function1() { // from class: ih60
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj8) {
                                                                        function5.invoke(new zg60.a(((Boolean) obj8).booleanValue()));
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY8);
                                                            }
                                                            Function1 function8 = (Function1) objY8;
                                                            boolean zM6 = aVar4.M(function5) | aVar4.M(dVar4);
                                                            Object objY9 = aVar4.y();
                                                            if (zM6 || objY9 == c0042a2) {
                                                                objY9 = new m2y(1, dVar4, function5);
                                                                aVar4.r(objY9);
                                                            }
                                                            Function0 function0 = (Function0) objY9;
                                                            boolean zM7 = aVar4.M(function5) | aVar4.M(dVar4);
                                                            Object objY10 = aVar4.y();
                                                            if (zM7 || objY10 == c0042a2) {
                                                                objY10 = new n2y(1, dVar4, function5);
                                                                aVar4.r(objY10);
                                                            }
                                                            rsq.a(dVarJ, str4, str5, lVar3, jh0Var, z5, z4, zB, null, qcnVar3, null, null, null, function6, function7, function8, function0, (Function0) objY10, aVar4, ((i4 << 12) & 57344) | 6, 7424);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar2), aVar2, 200064, 18);
                                                aVar2.s();
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                } else if (zsqVar instanceof zsq.b) {
                                    final zsq.b bVar2 = (zsq.b) zsqVar;
                                    szrVar.i(inm.a("other_", bVar2.b), "other", new op8(768401255, new gaj() { // from class: alz
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            a aVar2 = (a) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((gwr) obj2).getClass();
                                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                d dVarJ = h.j(h.h(d.a.b, ((cjb0) aVar2.O(ejb0.a)).e, 0.0f, 2), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                                final zsq.b bVar3 = bVar2;
                                                String str4 = bVar3.a;
                                                qcn<xxq> qcnVar3 = bVar3.d;
                                                boolean zB = bVar3.b();
                                                final Function1 function4 = function3;
                                                boolean zM3 = aVar2.M(function4) | aVar2.M(bVar3);
                                                Object objY4 = aVar2.y();
                                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                if (zM3 || objY4 == c0042a2) {
                                                    objY4 = new Function1() { // from class: blz
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj5) {
                                                            String str5 = (String) obj5;
                                                            str5.getClass();
                                                            function4.invoke(new wkz.a(str5, bVar3.b));
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar2.r(objY4);
                                                }
                                                Function1 function5 = (Function1) objY4;
                                                boolean zM4 = aVar2.M(function4) | aVar2.M(bVar3);
                                                Object objY5 = aVar2.y();
                                                if (zM4 || objY5 == c0042a2) {
                                                    objY5 = new Function0() { // from class: clz
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            function4.invoke(new zxq.l(bVar3.c));
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar2.r(objY5);
                                                }
                                                wxq.a(dVarJ, str4, qcnVar3, zB, function5, (Function0) objY5, aVar2, 0);
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                } else {
                                    if (!(zsqVar instanceof zsq.c)) {
                                        uhc.a();
                                        return null;
                                    }
                                    final zsq.c cVar2 = (zsq.c) zsqVar;
                                    szrVar.i(inm.a("other_", cVar2.b), "other", new op8(169077565, new gaj() { // from class: dmz
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            a aVar2 = (a) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((gwr) obj2).getClass();
                                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                d dVarJ = h.j(h.h(d.a.b, ((cjb0) aVar2.O(ejb0.a)).e, 0.0f, 2), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                                final zsq.c cVar3 = cVar2;
                                                String str4 = cVar3.a;
                                                qcn<xxq> qcnVar3 = cVar3.d;
                                                boolean zB = cVar3.b();
                                                final Function1 function4 = function3;
                                                boolean zM3 = aVar2.M(function4) | aVar2.M(cVar3);
                                                Object objY4 = aVar2.y();
                                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                if (zM3 || objY4 == c0042a2) {
                                                    objY4 = new emz(0, function4, cVar3);
                                                    aVar2.r(objY4);
                                                }
                                                Function1 function5 = (Function1) objY4;
                                                boolean zM4 = aVar2.M(function4) | aVar2.M(cVar3);
                                                Object objY5 = aVar2.y();
                                                if (zM4 || objY5 == c0042a2) {
                                                    objY5 = new Function0() { // from class: fmz
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            function4.invoke(new zxq.l(cVar3.c));
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar2.r(objY5);
                                                }
                                                wxq.a(dVarJ, str4, qcnVar3, zB, function5, (Function0) objY5, aVar2, 0);
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                }
                            }
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            bVar = bVarI;
            wzp.c(dVarB, umzVarB, f2, glqVar, zzrVar, op8VarB, op8VarB2, op8VarB3, yypVar, "lottery_menu", (Function1) objY3, bVar, (i3 & 896) | 819658800 | (57344 & (i3 >> 6)) | ((i3 >> 3) & 234881024));
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wzq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f0r.e(dVar, lVar, f2, z, cVar, mhrVar, zzrVar, function1, function2, yypVar, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final androidx.compose.ui.d dVar, final String str, final String str2, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        String str3;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(607700694);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str3 = str;
            i3 |= bVarI.M(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            i78 i78VarA = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(str3, androidx.compose.foundation.layout.j.g(androidx.compose.ui.d.a.b, 1.0f), ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((ijb0) bVarI.O(kjb0.a)).f, bVarI, ((i3 >> 3) & 14) | 48, 24960, 110584);
            bVar = bVarI;
            xir.a((i3 >> 6) & WebSocketProtocol.PAYLOAD_SHORT, bVar, str2, function0);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b0r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    f0r.f(dVar, str, str2, function0, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(hsq hsqVar, twd0 twd0Var, Function0 function0, androidx.compose.runtime.a aVar, int i2) {
        twd0 twd0Var2;
        int i3;
        twd0 twd0Var3;
        androidx.compose.runtime.b bVarI = aVar.i(-1026180844);
        int i4 = (bVarI.M(hsqVar) ? 4 : 2) | i2 | 16 | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            bVarI.A0();
            if ((i2 & 1) == 0 || bVarI.h0()) {
                hsqVar.getClass();
                ytw ytwVarC = wyh.c(hsqVar.k, bVarI, 0, 7);
                boolean zE = bVarI.e(hsqVar.l);
                Object objY = bVarI.y();
                if (zE || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = a6a0.b(new cmt(hsqVar, ytwVarC));
                    bVarI.r(objY);
                }
                i3 = i4 & (-113);
                twd0Var3 = (twd0) objY;
            } else {
                bVarI.G();
                i3 = i4 & (-113);
                twd0Var3 = twd0Var;
            }
            bVarI.Y();
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.h.f(androidx.compose.foundation.layout.j.g(aVar2, 1.0f), 12.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            dcq.a(null, hsqVar.g, false, bVarI, 384, 1);
            f(zqu.a(1.0f, androidx.compose.foundation.layout.h.h(aVar2, 8.0f, 0.0f, 2), true), hsqVar.i, hsqVar.j, function0, bVarI, (i3 << 3) & 7168);
            p0r.d((o4q) twd0Var3.getValue(), bVarI, 0);
            bVarI.X(true);
            twd0Var2 = twd0Var3;
        } else {
            bVarI.G();
            twd0Var2 = twd0Var;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new a0r(hsqVar, twd0Var2, function0, i2);
        }
    }

    public static final void h(final e0q e0qVar, androidx.compose.animation.l lVar, final boolean z, final Function1<? super zxq, Unit> function1, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        final androidx.compose.animation.l lVar2 = lVar;
        androidx.compose.runtime.b bVarI = aVar.i(222010714);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(e0qVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(lVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            hh0.e(!(e0qVar instanceof e0q.b), androidx.compose.foundation.layout.j.e(aVar2, 1.0f), androidx.compose.animation.f.f(null, 3), androidx.compose.animation.f.g(null, 3), null, pp8.b(883455874, new gaj() { // from class: uyq
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final Function1 function2 = function1;
                        boolean zM = aVar3.M(function2);
                        Object objY = aVar3.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM || objY == c0042a) {
                            objY = new Function0() { // from class: pzq
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function2.invoke(zxq.d.a);
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY);
                        }
                        tr1.a(false, (Function0) objY, aVar3, 0, 1);
                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.c(0.75f, j58.b), zk40.a);
                        boolean zM2 = aVar3.M(function2);
                        Object objY2 = aVar3.y();
                        if (zM2 || objY2 == c0042a) {
                            objY2 = new kdc(function2, 1);
                            aVar3.r(objY2);
                        }
                        g75.a(g3w.f(dVarB, true, (Function0) objY2), aVar3, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 200112, 16);
            androidx.compose.ui.d dVarE = androidx.compose.foundation.layout.j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lVar2 = lVar;
            hh0.e(e0qVar instanceof e0q.a, null, androidx.compose.animation.f.f(null, 3), androidx.compose.animation.f.g(null, 3), null, pp8.b(-1157487556, new gaj() { // from class: vyq
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    jh0 jh0Var = (jh0) obj;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    jh0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(jh0Var) : aVar4.A(jh0Var) ? 4 : 2;
                    }
                    int i4 = 0;
                    if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        Object objY = aVar4.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = m.b(null);
                            aVar4.r(objY);
                        }
                        ytw ytwVar = (ytw) objY;
                        e0q e0qVar2 = e0qVar;
                        boolean zM = aVar4.M(e0qVar2);
                        Object objY2 = aVar4.y();
                        if (zM || objY2 == c0042a) {
                            objY2 = new f0r.l(e0qVar2, ytwVar, null);
                            aVar4.r(objY2);
                        }
                        xvf.e(aVar4, e0qVar2, (Function2) objY2);
                        final e0q.a aVar5 = (e0q.a) (e0qVar2 instanceof e0q.a ? e0qVar2 : null);
                        if (aVar5 == null && (aVar5 = (e0q.a) ytwVar.getValue()) == null) {
                            return Unit.a;
                        }
                        zsq zsqVar = aVar5.a;
                        if (zsqVar.equals(zsq.a.a)) {
                            aVar4.N(1581105092);
                            aVar4.H();
                        } else {
                            boolean z2 = zsqVar instanceof zsq.f;
                            l lVar3 = lVar2;
                            final Function1 function2 = function1;
                            boolean z3 = z;
                            if (z2) {
                                aVar4.N(1581226209);
                                zsq.f fVar = (zsq.f) zsqVar;
                                String str = fVar.b;
                                String str2 = fVar.a;
                                int i5 = iIntValue;
                                boolean z4 = fVar.e;
                                boolean z5 = fVar.d;
                                qcn<kxq> qcnVar = fVar.f;
                                boolean zB = zsqVar.b();
                                boolean zM2 = aVar4.M(function2);
                                Object objY3 = aVar4.y();
                                if (zM2 || objY3 == c0042a) {
                                    objY3 = new yac(function2, 1);
                                    aVar4.r(objY3);
                                }
                                Function1 function3 = (Function1) objY3;
                                boolean zM3 = aVar4.M(function2);
                                Object objY4 = aVar4.y();
                                if (zM3 || objY4 == c0042a) {
                                    objY4 = new hzq(function2, i4);
                                    aVar4.r(objY4);
                                }
                                Function1 function4 = (Function1) objY4;
                                boolean zM4 = aVar4.M(function2);
                                Object objY5 = aVar4.y();
                                if (zM4 || objY5 == c0042a) {
                                    objY5 = new Function1() { // from class: izq
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            function2.invoke(new jp60.b(((Boolean) obj4).booleanValue()));
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY5);
                                }
                                Function1 function5 = (Function1) objY5;
                                boolean zM5 = aVar4.M(function2) | aVar4.M(aVar5);
                                Object objY6 = aVar4.y();
                                if (zM5 || objY6 == c0042a) {
                                    objY6 = new g9m(1, function2, aVar5);
                                    aVar4.r(objY6);
                                }
                                Function0 function0 = (Function0) objY6;
                                boolean zM6 = aVar4.M(function2);
                                Object objY7 = aVar4.y();
                                if (zM6 || objY7 == c0042a) {
                                    objY7 = new no8(function2, 1);
                                    aVar4.r(objY7);
                                }
                                x5q.a(str, z4, z5, str2, qcnVar, null, lVar3, jh0Var, function3, function4, function5, zB, z3, function0, (Function0) objY7, aVar4, (i5 << 21) & 29360128, 32);
                                aVar4.H();
                            } else {
                                int i6 = iIntValue;
                                if (zsqVar instanceof zsq.e) {
                                    aVar4.N(1583095385);
                                    zsq.e eVar = (zsq.e) zsqVar;
                                    String str3 = eVar.b;
                                    String str4 = eVar.a;
                                    boolean z6 = eVar.e;
                                    boolean z7 = eVar.d;
                                    qcn<kxq> qcnVar2 = eVar.f;
                                    boolean zB2 = zsqVar.b();
                                    boolean zM7 = aVar4.M(function2);
                                    Object objY8 = aVar4.y();
                                    if (zM7 || objY8 == c0042a) {
                                        objY8 = new Function1() { // from class: jzq
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                zxq zxqVar = (zxq) obj4;
                                                zxqVar.getClass();
                                                function2.invoke(zxqVar);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY8);
                                    }
                                    Function1 function6 = (Function1) objY8;
                                    boolean zM8 = aVar4.M(function2);
                                    Object objY9 = aVar4.y();
                                    if (zM8 || objY9 == c0042a) {
                                        objY9 = new kzq(function2, 0);
                                        aVar4.r(objY9);
                                    }
                                    Function1 function7 = (Function1) objY9;
                                    boolean zM9 = aVar4.M(function2);
                                    Object objY10 = aVar4.y();
                                    if (zM9 || objY10 == c0042a) {
                                        objY10 = new Function1() { // from class: lzq
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                function2.invoke(new io60.b(((Boolean) obj4).booleanValue()));
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY10);
                                    }
                                    Function1 function8 = (Function1) objY10;
                                    boolean zM10 = aVar4.M(function2) | aVar4.M(aVar5);
                                    Object objY11 = aVar4.y();
                                    if (zM10 || objY11 == c0042a) {
                                        objY11 = new Function0() { // from class: mzq
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function2.invoke(new zxq.l(((zsq.e) aVar5.a).c, HowToPlayPresentation.MAIN_DRAW_DIALOG));
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY11);
                                    }
                                    Function0 function9 = (Function0) objY11;
                                    boolean zM11 = aVar4.M(function2);
                                    Object objY12 = aVar4.y();
                                    if (zM11 || objY12 == c0042a) {
                                        objY12 = new nzq(function2, 0);
                                        aVar4.r(objY12);
                                    }
                                    x5q.a(str3, z6, z7, str4, qcnVar2, null, lVar3, jh0Var, function6, function7, function8, zB2, z3, function9, (Function0) objY12, aVar4, (i6 << 21) & 29360128, 32);
                                    aVar4.H();
                                } else if (zsqVar instanceof zsq.g) {
                                    aVar4.N(1584804601);
                                    zsq.g gVar = (zsq.g) zsqVar;
                                    String str5 = gVar.b;
                                    String str6 = gVar.a;
                                    boolean z8 = gVar.e;
                                    boolean z9 = gVar.d;
                                    qcn<kxq> qcnVar3 = gVar.f;
                                    qcn<kxq> qcnVar4 = gVar.g;
                                    boolean zB3 = zsqVar.b();
                                    boolean zM12 = aVar4.M(function2);
                                    Object objY13 = aVar4.y();
                                    if (zM12 || objY13 == c0042a) {
                                        objY13 = new zac(function2, 1);
                                        aVar4.r(objY13);
                                    }
                                    Function1 function10 = (Function1) objY13;
                                    boolean zM13 = aVar4.M(function2);
                                    Object objY14 = aVar4.y();
                                    if (zM13 || objY14 == c0042a) {
                                        objY14 = new Function1() { // from class: azq
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                function2.invoke(new vo60.a(((Boolean) obj4).booleanValue()));
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY14);
                                    }
                                    Function1 function11 = (Function1) objY14;
                                    boolean zM14 = aVar4.M(function2);
                                    Object objY15 = aVar4.y();
                                    if (zM14 || objY15 == c0042a) {
                                        objY15 = new Function1() { // from class: bzq
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                function2.invoke(new vo60.b(((Boolean) obj4).booleanValue()));
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY15);
                                    }
                                    Function1 function12 = (Function1) objY15;
                                    boolean zM15 = aVar4.M(function2) | aVar4.M(aVar5);
                                    Object objY16 = aVar4.y();
                                    if (zM15 || objY16 == c0042a) {
                                        objY16 = new Function0() { // from class: czq
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function2.invoke(new zxq.l(((zsq.g) aVar5.a).c, HowToPlayPresentation.MAIN_DRAW_DIALOG));
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY16);
                                    }
                                    Function0 function13 = (Function0) objY16;
                                    boolean zM16 = aVar4.M(function2);
                                    Object objY17 = aVar4.y();
                                    if (zM16 || objY17 == c0042a) {
                                        objY17 = new dzq(0, function2);
                                        aVar4.r(objY17);
                                    }
                                    x5q.a(str5, z8, z9, str6, qcnVar3, qcnVar4, lVar3, jh0Var, function10, function11, function12, zB3, z3, function13, (Function0) objY17, aVar4, (i6 << 21) & 29360128, 0);
                                    aVar4.H();
                                } else if (zsqVar instanceof zsq.d) {
                                    aVar4.N(1586571353);
                                    zsq.d dVar = (zsq.d) zsqVar;
                                    String str7 = dVar.b;
                                    String str8 = dVar.a;
                                    boolean z10 = dVar.e;
                                    boolean z11 = dVar.d;
                                    qcn<kxq> qcnVar5 = dVar.f;
                                    boolean zB4 = zsqVar.b();
                                    boolean zM17 = aVar4.M(function2);
                                    Object objY18 = aVar4.y();
                                    if (zM17 || objY18 == c0042a) {
                                        objY18 = new ebc(function2, 1);
                                        aVar4.r(objY18);
                                    }
                                    Function1 function14 = (Function1) objY18;
                                    boolean zM18 = aVar4.M(function2);
                                    Object objY19 = aVar4.y();
                                    if (zM18 || objY19 == c0042a) {
                                        objY19 = new Function1() { // from class: ezq
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                function2.invoke(new zg60.a(((Boolean) obj4).booleanValue()));
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY19);
                                    }
                                    Function1 function15 = (Function1) objY19;
                                    boolean zM19 = aVar4.M(function2);
                                    Object objY20 = aVar4.y();
                                    if (zM19 || objY20 == c0042a) {
                                        objY20 = new fzq(function2, 0);
                                        aVar4.r(objY20);
                                    }
                                    Function1 function16 = (Function1) objY20;
                                    boolean zM20 = aVar4.M(function2) | aVar4.M(aVar5);
                                    Object objY21 = aVar4.y();
                                    if (zM20 || objY21 == c0042a) {
                                        objY21 = new Function0() { // from class: gzq
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function2.invoke(new zxq.l(((zsq.d) aVar5.a).c, HowToPlayPresentation.MAIN_DRAW_DIALOG));
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY21);
                                    }
                                    Function0 function17 = (Function0) objY21;
                                    boolean zM21 = aVar4.M(function2);
                                    Object objY22 = aVar4.y();
                                    if (zM21 || objY22 == c0042a) {
                                        objY22 = new jbc(function2, 1);
                                        aVar4.r(objY22);
                                    }
                                    x5q.a(str7, z10, z11, str8, qcnVar5, null, lVar3, jh0Var, function14, function15, function16, zB4, z3, function17, (Function0) objY22, aVar4, (i6 << 21) & 29360128, 32);
                                    aVar4.H();
                                } else {
                                    if (!(zsqVar instanceof zsq.b) && !(zsqVar instanceof zsq.c)) {
                                        throw rg.a(51008805, aVar4);
                                    }
                                    aVar4.N(1588246500);
                                    aVar4.H();
                                }
                            }
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 200064, 18);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wyq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f0r.h(e0qVar, lVar2, z, function1, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15 */
    public static final void i(final t1r t1rVar, final mhr mhrVar, final v3a0 v3a0Var, boolean z, final Function1<? super zxq, Unit> function1, final Function1<? super ler, Unit> function2, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        boolean z2;
        int i4;
        androidx.compose.runtime.b bVar;
        final boolean z3;
        boolean z4;
        int i5;
        boolean z5;
        androidx.compose.runtime.b bVarI = aVar.i(-171442195);
        int i6 = (bVarI.M(t1rVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i6 |= (i2 & 64) == 0 ? bVarI.M(mhrVar) : bVarI.A(mhrVar) ? 32 : 16;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (bVarI.b(z2) ? 2048 : 1024);
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= bVarI.A(function2) ? 131072 : 65536;
        }
        int i8 = i4;
        if (bVarI.q(i8 & 1, (74899 & i8) != 74898)) {
            boolean z6 = i7 != 0 ? false : z2;
            z3r z3rVar = mhrVar != null ? mhrVar.d : null;
            z3r.b bVar2 = z3rVar instanceof z3r.b ? (z3r.b) z3rVar : null;
            c(bVar2 != null && bVar2.d, bVarI, 0);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (bVar2 == null || !bVar2.d) {
                bVarI.N(-717044245);
                androidx.compose.ui.d dVarE = androidx.compose.foundation.layout.j.e(aVar2, 1.0f);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                Object objY = bVarI.y();
                if (objY == c0042a) {
                    objY = androidx.compose.runtime.m.b(new g7f(0.0f));
                    bVarI.r(objY);
                }
                final ytw ytwVar = (ytw) objY;
                final boolean z7 = z6;
                z4 = z7;
                u.a(androidx.compose.foundation.layout.j.e(aVar2, 1.0f), pp8.b(-1709258363, new gaj() { // from class: cyq
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final l lVar = (l) obj;
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        lVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar4.M(lVar) ? 4 : 2;
                        }
                        int i9 = iIntValue;
                        if (aVar4.q(i9 & 1, (i9 & 19) != 18)) {
                            long j2 = ((lib0) aVar4.O(oib0.a)).q0;
                            zk40.a aVar5 = zk40.a;
                            d.a aVar6 = d.a.b;
                            d dVarE2 = j.e(androidx.compose.foundation.a.b(aVar6, j2, aVar5), 1.0f);
                            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar4, 0);
                            int iHashCode2 = Long.hashCode(aVar4.m());
                            ne00 ne00VarO = aVar4.o();
                            d dVarC2 = c.c(aVar4, dVarE2);
                            yka.k.getClass();
                            tsr.a aVar7 = yka.a.b;
                            if (aVar4.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar7);
                            } else {
                                aVar4.p();
                            }
                            hlh0.a(aVar4, i78VarA, yka.a.f);
                            hlh0.a(aVar4, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                            }
                            hlh0.a(aVar4, dVarC2, yka.a.d);
                            hfs hfsVarA = ya5.a.a(0.0f, 0.0f, 14, b.k(new j58(r58.d(4280625199L)), new j58(r58.d(4278651409L))));
                            final Function1 function3 = function1;
                            boolean zM = aVar4.M(function3);
                            Object objY2 = aVar4.y();
                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                            if (zM || objY2 == c0042a2) {
                                objY2 = new Function0() { // from class: jyq
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(zxq.c.a);
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY2);
                            }
                            final t1r t1rVar2 = t1rVar;
                            e5u.a(null, hfsVarA, "", (Function0) objY2, pp8.b(1738860867, new gaj() { // from class: kyq
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    e160 e160Var = (e160) obj4;
                                    a aVar8 = (a) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    e160Var.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= aVar8.M(e160Var) ? 4 : 2;
                                    }
                                    if (aVar8.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        qyd0 qyd0Var = ejb0.a;
                                        float f2 = ((cjb0) aVar8.O(qyd0Var)).d;
                                        d.a aVar9 = d.a.b;
                                        d dVarJ = h.j(aVar9, 0.0f, 0.0f, f2, 0.0f, 11);
                                        final t1r t1rVar3 = t1rVar2;
                                        boolean z8 = t1rVar3.b instanceof k0r.c;
                                        Object objY3 = aVar8.y();
                                        a.C0041a.C0042a c0042a3 = a.C0041a.a;
                                        if (objY3 == c0042a3) {
                                            objY3 = new qoz();
                                            aVar8.r(objY3);
                                        }
                                        t9g t9gVarB = f.o(null, (Function1) objY3, 1).b(f.f(null, 1));
                                        Object objY4 = aVar8.y();
                                        if (objY4 == c0042a3) {
                                            objY4 = new qoz();
                                            aVar8.r(objY4);
                                        }
                                        owg owgVarB = f.s(null, (Function1) objY4, 1).b(f.g(null, 1));
                                        final Function1 function4 = function3;
                                        int i10 = (iIntValue2 & 14) | 1600512;
                                        hh0.d(e160Var, z8, dVarJ, t9gVarB, owgVarB, null, pp8.b(1753034091, new gaj() { // from class: syq
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                crz crzVarA;
                                                a aVar10 = (a) obj8;
                                                int iIntValue3 = ((Integer) obj9).intValue();
                                                ((jh0) obj7).getClass();
                                                if (aVar10.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    d dVarR = j.r(d.a.b, 24.0f);
                                                    Object objY5 = aVar10.y();
                                                    a.C0041a.C0042a c0042a4 = a.C0041a.a;
                                                    if (objY5 == c0042a4) {
                                                        objY5 = pr7.a(aVar10);
                                                    }
                                                    psw pswVar = (psw) objY5;
                                                    xt50 xt50VarA = ut50.a(20.0f, j58.f, false);
                                                    Function1 function5 = function4;
                                                    boolean zM2 = aVar10.M(function5);
                                                    t1r t1rVar4 = t1rVar3;
                                                    boolean zA = zM2 | aVar10.A(t1rVar4);
                                                    Object objY6 = aVar10.y();
                                                    if (zA || objY6 == c0042a4) {
                                                        objY6 = new pk3(1, t1rVar4, function5);
                                                        aVar10.r(objY6);
                                                    }
                                                    d dVarB = androidx.compose.foundation.d.b(dVarR, pswVar, xt50VarA, false, null, mla.d((Function0) objY6, aVar10, 0), 28);
                                                    if (t1rVar4.b.b()) {
                                                        aVar10.N(2132463004);
                                                        crzVarA = erz.a(R.drawable.ic_star_on, 0, aVar10);
                                                        aVar10.H();
                                                    } else {
                                                        aVar10.N(2132591065);
                                                        crzVarA = erz.a(R.drawable.ic_star_empty, 0, aVar10);
                                                        aVar10.H();
                                                    }
                                                    h6n.b(crzVarA, "Animated Icon", dVarB, ((lib0) aVar10.O(oib0.a)).a0, aVar10, 48, 0);
                                                } else {
                                                    aVar10.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar8), aVar8, i10, 16);
                                        d dVarJ2 = h.j(aVar9, 0.0f, 0.0f, ((cjb0) aVar8.O(qyd0Var)).d, 0.0f, 11);
                                        boolean zA = t1rVar3.b.a();
                                        Object objY5 = aVar8.y();
                                        if (objY5 == c0042a3) {
                                            objY5 = new qoz();
                                            aVar8.r(objY5);
                                        }
                                        t9g t9gVarB2 = f.o(null, (Function1) objY5, 1).b(f.f(null, 1));
                                        Object objY6 = aVar8.y();
                                        if (objY6 == c0042a3) {
                                            objY6 = new qoz();
                                            aVar8.r(objY6);
                                        }
                                        hh0.d(e160Var, zA, dVarJ2, t9gVarB2, f.s(null, (Function1) objY6, 1).b(f.g(null, 1)), null, pp8.b(1401653588, new gaj() { // from class: tyq
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                a aVar10 = (a) obj8;
                                                int iIntValue3 = ((Integer) obj9).intValue();
                                                ((jh0) obj7).getClass();
                                                if (aVar10.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    d dVarR = j.r(d.a.b, 24.0f);
                                                    Object objY7 = aVar10.y();
                                                    a.C0041a.C0042a c0042a4 = a.C0041a.a;
                                                    if (objY7 == c0042a4) {
                                                        objY7 = pr7.a(aVar10);
                                                    }
                                                    psw pswVar = (psw) objY7;
                                                    xt50 xt50VarA = ut50.a(20.0f, j58.f, false);
                                                    final Function1 function5 = function4;
                                                    boolean zM2 = aVar10.M(function5);
                                                    Object objY8 = aVar10.y();
                                                    if (zM2 || objY8 == c0042a4) {
                                                        objY8 = new Function0() { // from class: qzq
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                function5.invoke(zxq.m.a);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar10.r(objY8);
                                                    }
                                                    h6n.b(erz.a(R.drawable.ic_lucky_number_my_number, 0, aVar10), "Animated Icon", androidx.compose.foundation.d.b(dVarR, pswVar, xt50VarA, false, null, mla.d((Function0) objY8, aVar10, 0), 28), ((lib0) aVar10.O(oib0.a)).a0, aVar10, 48, 0);
                                                } else {
                                                    aVar10.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar8), aVar8, i10, 16);
                                        d dVarR = j.r(h.j(aVar9, 0.0f, 0.0f, ((cjb0) aVar8.O(qyd0Var)).d, 0.0f, 11), 24.0f);
                                        Object objY7 = aVar8.y();
                                        if (objY7 == c0042a3) {
                                            objY7 = pr7.a(aVar8);
                                        }
                                        psw pswVar = (psw) objY7;
                                        xt50 xt50VarA = ut50.a(20.0f, j58.f, false);
                                        boolean zM2 = aVar8.M(function4);
                                        Object objY8 = aVar8.y();
                                        if (zM2 || objY8 == c0042a3) {
                                            objY8 = new f1h(1, function4);
                                            aVar8.r(objY8);
                                        }
                                        h6n.b(erz.a(R.drawable.ic__feature__bet_history, 0, aVar8), null, androidx.compose.foundation.d.b(dVarR, pswVar, xt50VarA, false, null, mla.d((Function0) objY8, aVar8, 0), 28), ((lib0) aVar8.O(oib0.a)).a0, aVar8, 48, 0);
                                        bxp.b(h.j(aVar9, 0.0f, 0.0f, 8.0f, 0.0f, 11), aVar8, 6);
                                    } else {
                                        aVar8.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar4), aVar4, 25008, 1);
                            d dVarG = j.g(aVar6, 1.0f);
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            d dVarN = dVarG.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                            k0r k0rVar = t1rVar2.b;
                            Object objY3 = aVar4.y();
                            if (objY3 == c0042a2) {
                                objY3 = new lyq();
                                aVar4.r(objY3);
                            }
                            Function1 function4 = (Function1) objY3;
                            Object objY4 = aVar4.y();
                            if (objY4 == c0042a2) {
                                objY4 = new myq();
                                aVar4.r(objY4);
                            }
                            final mhr mhrVar2 = mhrVar;
                            final Function1 function5 = function2;
                            final ytw ytwVar2 = ytwVar;
                            androidx.compose.animation.a.b(k0rVar, dVarN, function4, null, null, (Function1) objY4, pp8.b(-1171309806, new iaj() { // from class: nyq
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.iaj
                                public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    k0r k0rVar2 = (k0r) obj5;
                                    a aVar8 = (a) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    ((pf0) obj4).getClass();
                                    k0rVar2.getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= aVar8.M(k0rVar2) ? 32 : 16;
                                    }
                                    boolean z8 = true;
                                    if (aVar8.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        boolean zEquals = k0rVar2.equals(k0r.a.a);
                                        d.a aVar9 = d.a.b;
                                        final Function1 function6 = function3;
                                        a.C0041a.C0042a c0042a3 = a.C0041a.a;
                                        if (zEquals) {
                                            aVar8.N(-347288645);
                                            d dVarC3 = j.c(aVar9, 1.0f);
                                            boolean zM2 = aVar8.M(function6);
                                            Object objY5 = aVar8.y();
                                            if (zM2 || objY5 == c0042a3) {
                                                objY5 = new tac(function6, 2);
                                                aVar8.r(objY5);
                                            }
                                            e7q.a(dVarC3, 0L, 0L, 0L, 0L, (Function0) objY5, aVar8, 6, 30);
                                            aVar8.H();
                                        } else if (k0rVar2.equals(k0r.b.a)) {
                                            aVar8.N(-347280254);
                                            if (1.0f <= 0.0d) {
                                                ukn.a("invalid weight; must be greater than zero");
                                            }
                                            d0q.a(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), aVar8, 0);
                                            aVar8.H();
                                        } else {
                                            if (!(k0rVar2 instanceof k0r.c)) {
                                                throw rg.a(-347287634, aVar8);
                                            }
                                            aVar8.N(-347271633);
                                            if (1.0f <= 0.0d) {
                                                ukn.a("invalid weight; must be greater than zero");
                                            }
                                            d dVarG2 = j.g(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                                            aiv aivVarC2 = g75.c(ht.a.b, false);
                                            int iHashCode3 = Long.hashCode(aVar8.m());
                                            ne00 ne00VarO2 = aVar8.o();
                                            d dVarC4 = c.c(aVar8, dVarG2);
                                            yka.k.getClass();
                                            tsr.a aVar10 = yka.a.b;
                                            if (aVar8.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar8.D();
                                            if (aVar8.g()) {
                                                aVar8.F(aVar10);
                                            } else {
                                                aVar8.p();
                                            }
                                            hlh0.a(aVar8, aivVarC2, yka.a.f);
                                            hlh0.a(aVar8, ne00VarO2, yka.a.e);
                                            yka.a.C1350a c1350a3 = yka.a.g;
                                            if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode3))) {
                                                j3c.a(iHashCode3, aVar8, iHashCode3, c1350a3);
                                            }
                                            hlh0.a(aVar8, dVarC4, yka.a.d);
                                            final zzr zzrVarA = e0s.a(0, 3, aVar8);
                                            Object objY6 = aVar8.y();
                                            if (objY6 == c0042a3) {
                                                objY6 = xvf.i(e.a, aVar8);
                                                aVar8.r(objY6);
                                            }
                                            final v5b v5bVar = (v5b) objY6;
                                            Object objY7 = aVar8.y();
                                            if (objY7 == c0042a3) {
                                                objY7 = new yyp();
                                                aVar8.r(objY7);
                                            }
                                            final yyp yypVar = (yyp) objY7;
                                            boolean zM3 = aVar8.M(function6) | aVar8.A(v5bVar) | aVar8.M(zzrVarA);
                                            Object objY8 = aVar8.y();
                                            if (zM3 || objY8 == c0042a3) {
                                                objY8 = new Function1() { // from class: xyq
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj8) {
                                                        zxq zxqVar = (zxq) obj8;
                                                        zxqVar.getClass();
                                                        function6.invoke(zxqVar);
                                                        if (zxqVar instanceof zxq.e0) {
                                                            ej5.c(v5bVar, null, null, new f0r.n(zzrVarA, yypVar, null), 3);
                                                        }
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar8.r(objY8);
                                            }
                                            Function1 function7 = (Function1) objY8;
                                            d dVarE3 = j.e(aVar9, 1.0f);
                                            k0r.c cVar = (k0r.c) k0rVar2;
                                            t1r t1rVar3 = t1rVar2;
                                            v4r v4rVar = t1rVar3.e;
                                            if (Intrinsics.g(v4rVar, v4r.a.a)) {
                                                z8 = false;
                                            } else if (!(v4rVar instanceof v4r.b)) {
                                                uhc.a();
                                                return null;
                                            }
                                            g7f g7fVar = (g7f) ytwVar2.getValue();
                                            float f2 = g7fVar.a;
                                            g7f g7fVar2 = new g7f(0.0f);
                                            if (g7fVar.compareTo(g7fVar2) < 0) {
                                                g7fVar = g7fVar2;
                                            }
                                            l lVar2 = lVar;
                                            mhr mhrVar3 = mhrVar2;
                                            final Function1 function8 = function5;
                                            f0r.e(dVarE3, lVar2, g7fVar.a, z8, cVar, mhrVar3, zzrVarA, function7, function8, yypVar, aVar8, 805568518 | ((iIntValue2 << 9) & 57344));
                                            boolean z9 = t1rVar3.h;
                                            boolean zM4 = aVar8.M(function6);
                                            Object objY9 = aVar8.y();
                                            if (zM4 || objY9 == c0042a3) {
                                                objY9 = new Function0() { // from class: yyq
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        function6.invoke(zxq.g.a);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar8.r(objY9);
                                            }
                                            Function0 function0 = (Function0) objY9;
                                            boolean zM5 = aVar8.M(function8) | aVar8.A(v5bVar) | aVar8.M(zzrVarA);
                                            Object objY10 = aVar8.y();
                                            if (zM5 || objY10 == c0042a3) {
                                                objY10 = new Function0() { // from class: zyq
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        function8.invoke(new ler.g());
                                                        ej5.c(v5bVar, null, null, new f0r.m(zzrVarA, yypVar, null), 3);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar8.r(objY10);
                                            }
                                            cmq.a(z9, function0, (Function0) objY10, aVar8, 0);
                                            aVar8.s();
                                            aVar8.H();
                                        }
                                    } else {
                                        aVar8.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar4), aVar4, 1769856, 24);
                            aVar4.s();
                            f0r.h(t1rVar2.g, lVar, z7, function3, aVar4, (i9 << 3) & 112);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 54);
                m2q m2qVar = t1rVar.c;
                z2q z2qVar = m2qVar.c;
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new p9c(ytwVar, 2);
                    bVarI.r(objY2);
                }
                Function1 function3 = (Function1) objY2;
                int i9 = 57344 & i8;
                boolean z8 = i9 == 16384;
                Object objY3 = bVarI.y();
                if (z8 || objY3 == c0042a) {
                    objY3 = new Function0() { // from class: dyq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(zxq.j.b.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                Function0 function0 = (Function0) objY3;
                boolean z9 = i9 == 16384;
                Object objY4 = bVarI.y();
                if (z9 || objY4 == c0042a) {
                    objY4 = new rk8(function1, 1);
                    bVarI.r(objY4);
                }
                Function1 function4 = (Function1) objY4;
                boolean z10 = i9 == 16384;
                Object objY5 = bVarI.y();
                if (z10 || objY5 == c0042a) {
                    objY5 = new o(function1);
                    bVarI.r(objY5);
                }
                Function1 function5 = (Function1) objY5;
                boolean z11 = i9 == 16384;
                Object objY6 = bVarI.y();
                if (z11 || objY6 == c0042a) {
                    objY6 = new sk8(function1, 2);
                    bVarI.r(objY6);
                }
                Function1 function6 = (Function1) objY6;
                boolean z12 = i9 == 16384;
                Object objY7 = bVarI.y();
                if (z12 || objY7 == c0042a) {
                    objY7 = new eyq(function1, 0);
                    bVarI.r(objY7);
                }
                Function0 function7 = (Function0) objY7;
                boolean z13 = i9 == 16384;
                Object objY8 = bVarI.y();
                if (z13 || objY8 == c0042a) {
                    i5 = 0;
                    objY8 = new fyq(function1, i5);
                    bVarI.r(objY8);
                } else {
                    i5 = 0;
                }
                Function0 function8 = (Function0) objY8;
                int i10 = i9 == 16384 ? 1 : i5;
                Object objY9 = bVarI.y();
                if (i10 != 0 || objY9 == c0042a) {
                    objY9 = new uk8(function1, 1);
                    bVarI.r(objY9);
                }
                Function1 function9 = (Function1) objY9;
                boolean z14 = i9 == 16384;
                Object objY10 = bVarI.y();
                if (z14 || objY10 == c0042a) {
                    objY10 = new Function0() { // from class: gyq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new zxq.e(new nvp.d(wae.DEPOSIT)));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY10);
                }
                Function0 function10 = (Function0) objY10;
                boolean z15 = i9 == 16384;
                Object objY11 = bVarI.y();
                if (z15 || objY11 == c0042a) {
                    objY11 = new wk8(function1, 1);
                    bVarI.r(objY11);
                }
                Function0 function11 = (Function0) objY11;
                boolean z16 = i9 == 16384;
                Object objY12 = bVarI.y();
                if (z16 || objY12 == c0042a) {
                    objY12 = new Function0() { // from class: ryq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(zxq.p.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY12);
                }
                Function0 function12 = (Function0) objY12;
                boolean z17 = i9 == 16384;
                Object objY13 = bVarI.y();
                if (z17 || objY13 == c0042a) {
                    objY13 = new oi3(function1, 1);
                    bVarI.r(objY13);
                }
                Function0 function13 = (Function0) objY13;
                boolean z18 = i9 == 16384;
                Object objY14 = bVarI.y();
                if (z18 || objY14 == c0042a) {
                    z5 = true;
                    objY14 = new ibc(function1, 1);
                    bVarI.r(objY14);
                } else {
                    z5 = true;
                }
                Function1 function14 = (Function1) objY14;
                boolean z19 = i9 == 16384 ? z5 : false;
                Object objY15 = bVarI.y();
                if (z19 || objY15 == c0042a) {
                    objY15 = new Function1() { // from class: ozq
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            function1.invoke(new zxq.h0(((Boolean) obj).booleanValue()));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY15);
                }
                Function1 function15 = (Function1) objY15;
                boolean z20 = i9 == 16384 ? z5 : false;
                Object objY16 = bVarI.y();
                if (z20 || objY16 == c0042a) {
                    objY16 = new Function0() { // from class: vzq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(zxq.x.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY16);
                }
                Function0 function16 = (Function0) objY16;
                boolean z21 = i9 == 16384 ? z5 : false;
                Object objY17 = bVarI.y();
                if (z21 || objY17 == c0042a) {
                    objY17 = new Function0() { // from class: d0r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(zxq.a.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY17);
                }
                boolean z22 = z5;
                q1q.d(m2qVar, function3, function0, function4, z2qVar, function5, function6, function7, function8, function9, function10, function11, function12, function13, function14, function15, function16, (Function0) objY17, bVarI, 48);
                u5r.d(t1rVar.e, function1, bVarI, (i8 >> 9) & 112);
                y5q y5qVar = t1rVar.f;
                ?? r14 = i9 == 16384 ? z22 ? 1 : 0 : 0;
                Object objY18 = bVarI.y();
                if (r14 != 0 || objY18 == c0042a) {
                    objY18 = new ml3(function1, z22 ? 1 : 0);
                    bVarI.r(objY18);
                }
                f6q.e(y5qVar, (Function0) objY18, bVarI, 0);
                boolean z23 = t1rVar.d;
                ?? r15 = i9 == 16384 ? z22 ? 1 : 0 : 0;
                Object objY19 = bVarI.y();
                if (r15 != 0 || objY19 == c0042a) {
                    objY19 = new Function0() { // from class: e0r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(zxq.c.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY19);
                }
                nyp.a(z23, (Function0) objY19, 0L, bVarI, 0, 4);
                bVar = bVarI;
                s3a0.b(v3a0Var, v8j0.b(androidx.compose.foundation.layout.h.j(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.h), 0.0f, 0.0f, 0.0f, 12.0f, 7)), ha9.a, bVar, 390, 0);
                bVar.X(z22);
                bVar.X(false);
            } else {
                bVarI.N(-717821942);
                ?? r7 = (458752 & i8) == 131072;
                Object objY20 = bVarI.y();
                if (r7 != false || objY20 == c0042a) {
                    objY20 = new nzg(1, function2);
                    bVarI.r(objY20);
                }
                tr1.a(false, (Function0) objY20, bVarI, 0, 1);
                androidx.compose.ui.d dVarE2 = androidx.compose.foundation.layout.j.e(aVar2, 1.0f);
                UiText uiText = mhrVar.a;
                uiText.getClass();
                sir.f(((i8 >> 6) & 7168) | 24576, bVar2, bVarI, dVarE2, uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), function2, mhrVar.c);
                bVar = bVarI;
                bVar.X(false);
                z4 = z6;
            }
            z3 = z4;
        } else {
            bVar = bVarI;
            bVar.G();
            z3 = z2;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: byq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f0r.i(t1rVar, mhrVar, v3a0Var, z3, function1, function2, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(Activity activity) {
        n8j0.g cVar;
        Window window = activity.getWindow();
        qoa0 qoa0Var = new qoa0(activity.getWindow().getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            cVar = new n8j0.f(window, qoa0Var);
        } else if (i2 >= 30) {
            cVar = new n8j0.d(window, qoa0Var);
        } else {
            cVar = i2 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
        }
        cVar.f(519);
        activity.getWindow().getDecorView().setSystemUiVisibility(0);
        try {
            zi50.a aVar = zi50.b;
            activity.setRequestedOrientation(1);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(zzr zzrVar, int i2, yyp yypVar, x1b x1bVar) {
        g0r g0rVar;
        Object next;
        int iH;
        zzr zzrVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        Object objF;
        if (x1bVar instanceof g0r) {
            g0rVar = (g0r) x1bVar;
            int i7 = g0rVar.w;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                g0rVar.w = i7 - Integer.MIN_VALUE;
            } else {
                g0rVar = new g0r(x1bVar);
            }
        } else {
            g0rVar = new g0r(x1bVar);
        }
        Object obj = g0rVar.v;
        Object obj2 = y5b.a;
        int i8 = g0rVar.w;
        int i9 = 1;
        if (i8 == 0) {
            uj50.b(obj);
            or60 or60VarC = n95.c(new zo8(zzrVar, 1));
            h0r h0rVar = new h0r(i2, null);
            g0rVar.a = zzrVar;
            g0rVar.b = yypVar;
            g0rVar.c = i2;
            g0rVar.w = 1;
            if (s0i.b(or60VarC, h0rVar, g0rVar) != obj2) {
            }
            return obj2;
        }
        if (i8 == 1) {
            i2 = g0rVar.c;
            yypVar = g0rVar.b;
            zzrVar = g0rVar.a;
            uj50.b(obj);
        } else {
            if (i8 != 2) {
                if (i8 == 3) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = g0rVar.i;
            i5 = g0rVar.f;
            i6 = g0rVar.e;
            iH = g0rVar.d;
            i4 = g0rVar.c;
            zzrVar2 = g0rVar.a;
            uj50.b(obj);
        }
        g0rVar.a = null;
        g0rVar.b = null;
        g0rVar.c = i4;
        g0rVar.d = iH;
        g0rVar.e = i6;
        g0rVar.f = i5;
        g0rVar.i = i3;
        g0rVar.w = 3;
        objF = zzrVar2.f(i4, 0, g0rVar);
        if (objF != obj2) {
            return obj2;
        }
        return objF;
        kzr kzrVarJ = zzrVar.j();
        Iterator<T> it = kzrVarJ.k().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((zyr) next).getKey(), "lottery_menu"));
        zyr zyrVar = (zyr) next;
        if (zyrVar == null) {
            return Unit.a;
        }
        iH = kzrVarJ.h();
        int offset = zyrVar.getOffset() + zyrVar.a();
        int i10 = zyrVar.getOffset() <= iH ? 1 : 0;
        List<zyr> listK = kzrVarJ.k();
        if (listK != null && listK.isEmpty()) {
            i9 = 0;
            break;
        }
        Iterator<T> it2 = listK.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i9 = 0;
                break;
            }
            zyr zyrVar2 = (zyr) it2.next();
            if (zyrVar2.getIndex() > i2 && zyrVar2.getOffset() < offset) {
                break;
            }
        }
        if (i10 == 0 || i9 == 0) {
            return Unit.a;
        }
        g0rVar.a = zzrVar;
        g0rVar.b = null;
        g0rVar.c = i2;
        g0rVar.d = iH;
        g0rVar.e = offset;
        g0rVar.f = i10;
        g0rVar.i = i9;
        g0rVar.w = 2;
        Object objInvoke = yypVar.a.invoke(g0rVar);
        if (objInvoke != y5b.a) {
            objInvoke = Unit.a;
        }
        if (objInvoke != obj2) {
            int i11 = i9;
            zzrVar2 = zzrVar;
            i3 = i11;
            i4 = i2;
            i5 = i10;
            i6 = offset;
            g0rVar.a = null;
            g0rVar.b = null;
            g0rVar.c = i4;
            g0rVar.d = iH;
            g0rVar.e = i6;
            g0rVar.f = i5;
            g0rVar.i = i3;
            g0rVar.w = 3;
            objF = zzrVar2.f(i4, 0, g0rVar);
            if (objF != obj2) {
                return objF;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(zzr zzrVar, yyp yypVar, x1b x1bVar) {
        i0r i0rVar;
        Object objF;
        if (x1bVar instanceof i0r) {
            i0rVar = (i0r) x1bVar;
            int i2 = i0rVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0rVar.d = i2 - Integer.MIN_VALUE;
            } else {
                i0rVar = new i0r(x1bVar);
            }
        } else {
            i0rVar = new i0r(x1bVar);
        }
        Object obj = i0rVar.c;
        Object obj2 = y5b.a;
        int i3 = i0rVar.d;
        int i4 = 2;
        if (i3 == 0) {
            uj50.b(obj);
            or60 or60VarC = n95.c(new xo8(zzrVar, i4));
            j0r j0rVar = new j0r(2, null);
            i0rVar.a = zzrVar;
            i0rVar.b = yypVar;
            i0rVar.d = 1;
            if (s0i.b(or60VarC, j0rVar, i0rVar) != obj2) {
            }
            return obj2;
        }
        if (i3 == 1) {
            yypVar = i0rVar.b;
            zzrVar = i0rVar.a;
            uj50.b(obj);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzrVar = i0rVar.a;
            uj50.b(obj);
        }
        i0rVar.a = null;
        i0rVar.b = null;
        i0rVar.d = 3;
        uv60 uv60Var = zzr.x;
        objF = zzrVar.f(0, 0, i0rVar);
        if (objF != obj2) {
            return obj2;
        }
        return objF;
        i0rVar.a = zzrVar;
        i0rVar.b = null;
        i0rVar.d = 2;
        Object objInvoke = yypVar.a.invoke(i0rVar);
        if (objInvoke != obj2) {
            objInvoke = Unit.a;
        }
        if (objInvoke != obj2) {
            i0rVar.a = null;
            i0rVar.b = null;
            i0rVar.d = 3;
            uv60 uv60Var2 = zzr.x;
            objF = zzrVar.f(0, 0, i0rVar);
            if (objF != obj2) {
                return objF;
            }
        }
        return obj2;
    }
}
