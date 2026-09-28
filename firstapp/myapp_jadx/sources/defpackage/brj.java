package defpackage;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.esotericsoftware.spine.android.b;
import com.sportygames.piggybash.presentation.component.StableFrameSpineView;
import java.io.File;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class brj {
    public static final f4c a = new f4c(0.34f, 1.2f, 0.64f, 1.0f);
    public static final long b = n09.a(0.49f, 0.51f);

    @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.GameplaySpineKt$GameplayPigSpine$1$1", f = "GameplaySpine.kt", l = {122}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ a390<ooj> b;
        public final /* synthetic */ b c;
        public final /* synthetic */ ap20 d;

        /* JADX INFO: renamed from: brj$a$a, reason: collision with other inner class name */
        public static final class C0139a<T> implements myh {
            public final /* synthetic */ b a;
            public final /* synthetic */ ap20 b;

            /* JADX INFO: renamed from: brj$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.GameplaySpineKt$GameplayPigSpine$1$1$1", f = "GameplaySpine.kt", l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "emit", v = 1)
            public static final class C0140a extends x1b {
                public ooj a;
                public /* synthetic */ Object b;
                public final /* synthetic */ C0139a<T> c;
                public int d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0140a(C0139a<? super T> c0139a, v1b<? super C0140a> v1bVar) {
                    super(v1bVar);
                    this.c = c0139a;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.b = obj;
                    this.d |= Integer.MIN_VALUE;
                    return this.c.emit(null, this);
                }
            }

            public C0139a(b bVar, ap20 ap20Var) {
                this.a = bVar;
                this.b = ap20Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(ooj oojVar, v1b<? super Unit> v1bVar) {
                C0140a c0140a;
                if (v1bVar instanceof C0140a) {
                    c0140a = (C0140a) v1bVar;
                    int i = c0140a.d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0140a.d = i - Integer.MIN_VALUE;
                    } else {
                        c0140a = new C0140a(this, v1bVar);
                    }
                } else {
                    c0140a = new C0140a(this, v1bVar);
                }
                Object obj = c0140a.b;
                y5b y5bVar = y5b.a;
                int i2 = c0140a.d;
                if (i2 == 0) {
                    uj50.b(obj);
                    if (oojVar instanceof ooj.e) {
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oojVar = c0140a.a;
                uj50.b(obj);
                do {
                    b bVar = this.a;
                    if (bVar.c != null) {
                        ooj.e eVar = (ooj.e) oojVar;
                        boolean z = eVar.c;
                        String string = eVar.a;
                        if (z) {
                            if (this.b == ap20.b && string.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                String strValueOf = String.valueOf(string.charAt(0));
                                strValueOf.getClass();
                                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                sb.append((Object) upperCase);
                                sb.append(string.substring(1));
                                string = sb.toString();
                            }
                            bVar.b().b(bVar.b().a.f(string));
                            bVar.b().d();
                        } else {
                            bVar.a().m(0, string, eVar.b);
                        }
                        return Unit.a;
                    }
                    c0140a.a = oojVar;
                    c0140a.d = 1;
                } while (hkd.b(16L, c0140a) != y5bVar);
                return y5bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(a390<? extends ooj> a390Var, b bVar, ap20 ap20Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = a390Var;
            this.c = bVar;
            this.d = ap20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0139a c0139a = new C0139a(this.c, this.d);
                this.a = 1;
                if (this.b.collect(c0139a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fkd.a();
            return null;
        }
    }

    public static final void a(final String str, final String str2, androidx.compose.runtime.a aVar, final int i) {
        str.getClass();
        str2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-660265754);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new b(new pqj());
                bVarI.r(objY);
            }
            final b bVar = (b) objY;
            d dVarE = j.e(d.a.b, 1.0f);
            boolean zA = ((i2 & 14) == 4) | bVarI.A(bVar) | ((i2 & 112) == 32);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: qqj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        StableFrameSpineView stableFrameSpineView = new StableFrameSpineView(context, bVar);
                        stableFrameSpineView.setBoundsProvider(new sqj());
                        stableFrameSpineView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        stableFrameSpineView.b(new File(str), new File(str2));
                        return stableFrameSpineView;
                    }
                };
                bVarI.r(objY2);
            }
            androidx.compose.ui.viewinterop.b.a((Function1) objY2, dVarE, null, bVarI, 48, 4);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, i) { // from class: rqj
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    brj.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final long j, final ap20 ap20Var, final String str, final String str2, final a390<? extends ooj> a390Var, final Long l, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        str.getClass();
        str2.getClass();
        a390Var.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1040104111);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(ap20Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(a390Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(l) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 >> 15;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(1.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var = (wd0) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = ee0.a(1.0f);
                bVarI.r(objY2);
            }
            wd0 wd0Var2 = (wd0) objY2;
            boolean zA = ((((i3 & 14) ^ 6) > 4 && bVarI.M(l)) || (i3 & 6) == 4) | bVarI.A(wd0Var) | bVarI.A(wd0Var2);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new crj(l, wd0Var, wd0Var2, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, l, (Function2) objY3);
            final gu00 gu00Var = new gu00(((Number) wd0Var.d()).floatValue(), ((Number) wd0Var2.d()).floatValue());
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new Paint();
                bVarI.r(objY4);
            }
            final Paint paint = (Paint) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new b(new wqj());
                bVarI.r(objY5);
            }
            final b bVar = (b) objY5;
            Unit unit = Unit.a;
            int i4 = i2 & 112;
            boolean zA2 = bVarI.A(a390Var) | bVarI.A(bVar) | (i4 == 32);
            Object objY6 = bVarI.y();
            if (zA2 || objY6 == c0042a) {
                objY6 = new a(a390Var, bVar, ap20Var, null);
                bVarI.r(objY6);
            }
            xvf.e(bVarI, unit, (Function2) objY6);
            d dVarE = j.e(d.a.b, 1.0f);
            boolean zM = bVarI.M(gu00Var);
            Object objY7 = bVarI.y();
            if (zM || objY7 == c0042a) {
                objY7 = new xqj(gu00Var, 0);
                bVarI.r(objY7);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVarE, (Function1) objY7);
            int i5 = i2;
            boolean zA3 = ((i2 & 7168) == 2048) | bVarI.A(bVar) | (i4 == 32) | ((i2 & 896) == 256);
            Object objY8 = bVarI.y();
            if (zA3 || objY8 == c0042a) {
                objY8 = new Function1() { // from class: yqj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        StableFrameSpineView stableFrameSpineView = new StableFrameSpineView(context, bVar);
                        if (ap20Var == ap20.b) {
                            stableFrameSpineView.setBoundsProvider(new oqj());
                        }
                        stableFrameSpineView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        stableFrameSpineView.b(new File(str), new File(str2));
                        return stableFrameSpineView;
                    }
                };
                bVarI.r(objY8);
            }
            Function1 function1 = (Function1) objY8;
            boolean zM2 = bVarI.M(gu00Var) | bVarI.A(paint) | (i4 == 32) | ((i5 & 14) == 4);
            Object objY9 = bVarI.y();
            if (zM2 || objY9 == c0042a) {
                Function1 function2 = new Function1() { // from class: zqj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        StableFrameSpineView stableFrameSpineView = (StableFrameSpineView) obj;
                        stableFrameSpineView.getClass();
                        float f = gu00Var.b;
                        if (f == 1.0f) {
                            stableFrameSpineView.setLayerType(0, null);
                        } else {
                            ColorMatrix colorMatrix = new ColorMatrix();
                            colorMatrix.setScale(f, f, f, 1.0f);
                            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
                            Paint paint2 = paint;
                            paint2.setColorFilter(colorMatrixColorFilter);
                            stableFrameSpineView.setLayerType(2, paint2);
                        }
                        ap20 ap20Var2 = ap20.b;
                        ap20 ap20Var3 = ap20Var;
                        ap20 ap20Var4 = ap20Var3 == ap20Var2 ? ap20Var3 : null;
                        long j2 = j;
                        if (ap20Var4 != null) {
                            int i6 = (int) (j2 & 4294967295L);
                            if (i6 != 0) {
                                stableFrameSpineView.setTranslationY(i6 / 15.0f);
                            }
                            stableFrameSpineView.setScaleX(0.85f);
                            stableFrameSpineView.setScaleY(0.85f);
                        } else {
                            int i7 = (int) (j2 & 4294967295L);
                            if (i7 != 0) {
                                stableFrameSpineView.setTranslationY((-i7) / 6.5f);
                            }
                            stableFrameSpineView.setScaleX(0.85f);
                            stableFrameSpineView.setScaleY(0.85f);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function2);
                objY9 = function2;
            }
            androidx.compose.ui.viewinterop.b.a(function1, dVarA, (Function1) objY9, bVarI, 0, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: arj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    brj.b(j, ap20Var, str, str2, a390Var, l, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, d dVar, final String str, final String str2) {
        int i2;
        final d dVar2;
        str.getClass();
        str2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-248837273);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new b(new tqj());
                bVarI.r(objY);
            }
            final b bVar = (b) objY;
            boolean zA = ((i2 & 14) == 4) | bVarI.A(bVar) | ((i2 & 112) == 32);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: uqj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        StableFrameSpineView stableFrameSpineView = new StableFrameSpineView(context, bVar);
                        stableFrameSpineView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        stableFrameSpineView.b(new File(str), new File(str2));
                        return stableFrameSpineView;
                    }
                };
                bVarI.r(objY2);
            }
            dVar2 = dVar;
            androidx.compose.ui.viewinterop.b.a((Function1) objY2, dVar2, null, bVarI, (i2 >> 3) & 112, 4);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vqj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    brj.c(qj40.a(i | 1), (a) obj, dVar2, str, str2);
                    return Unit.a;
                }
            };
        }
    }
}
