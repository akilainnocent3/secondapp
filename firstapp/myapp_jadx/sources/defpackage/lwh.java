package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lwh {

    @c0d(c = "com.sportybet.android.instantwin.presentation.compose.flipscore.FlipScoreTextKt$FlipScoreText$1$1", f = "FlipScoreText.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ytw<String> d;
        public final /* synthetic */ ytw<String> e;
        public final /* synthetic */ isw f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, String str, ytw<String> ytwVar, ytw<String> ytwVar2, isw iswVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = str;
            this.d = ytwVar;
            this.e = ytwVar2;
            this.f = iswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            final isw iswVar = this.f;
            ytw<String> ytwVar = this.d;
            final String str = this.c;
            if (i == 0) {
                uj50.b(obj);
                boolean z = this.b;
                final ytw<String> ytwVar2 = this.e;
                if (!z) {
                    ytwVar.setValue(str);
                    ytwVar2.setValue(str);
                    iswVar.A(0.0f);
                    return Unit.a;
                }
                if (!Intrinsics.g(str, ytwVar2.getValue())) {
                    ytwVar.setValue(ytwVar2.getValue());
                    gzg0 gzg0VarE = yi0.e(900, 0, null, 6);
                    Function2 function2 = new Function2() { // from class: kwh
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            float fFloatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).getClass();
                            iswVar.A(fFloatValue);
                            if (fFloatValue >= 90.0f) {
                                ytw ytwVar3 = ytwVar2;
                                String str2 = (String) ytwVar3.getValue();
                                String str3 = str;
                                if (!Intrinsics.g(str2, str3)) {
                                    ytwVar3.setValue(str3);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    if (sje0.c(0.0f, 180.0f, 0.0f, gzg0VarE, function2, this, 4) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            ytwVar.setValue(str);
            iswVar.A(0.0f);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, boolean z, j58 j58Var, imf0 imf0Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        j58 j58Var2;
        int i4;
        imf0 imf0Var2;
        int i5;
        b bVar;
        final boolean z3;
        final j58 j58Var3;
        final imf0 imf0Var3;
        Object aVar2;
        String str2;
        long j;
        imf0 imf0Var4;
        str.getClass();
        b bVarI = aVar.i(-2027874434);
        int i6 = i | (bVarI.M(str) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (bVarI.b(z2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | 384;
            j58Var2 = j58Var;
        } else {
            j58Var2 = j58Var;
            i4 = i3 | (bVarI.M(j58Var2) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            imf0Var2 = imf0Var;
        } else {
            imf0Var2 = imf0Var;
            i5 = i4 | (bVarI.M(imf0Var2) ? 2048 : 1024);
        }
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            final boolean z4 = i7 != 0 ? true : z2;
            j58 j58Var4 = i8 != 0 ? null : j58Var2;
            imf0 imf0Var5 = i9 != 0 ? null : imf0Var2;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(str);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(str);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = j.a(0.0f);
                bVarI.r(objY3);
            }
            final isw iswVar = (isw) objY3;
            Boolean boolValueOf = Boolean.valueOf(z4);
            int i10 = i5 & 112;
            boolean z5 = ((i5 & 14) == 4) | (i10 == 32);
            Object objY4 = bVarI.y();
            if (z5 || objY4 == c0042a) {
                aVar2 = new a(z4, str, ytwVar2, ytwVar, iswVar, null);
                str2 = str;
                bVarI.r(aVar2);
            } else {
                aVar2 = objY4;
                str2 = str;
            }
            xvf.g(str2, boolValueOf, (Function2) aVar2, bVarI);
            String str3 = iswVar.j() < 90.0f ? (String) ytwVar2.getValue() : (String) ytwVar.getValue();
            boolean z6 = i10 == 32;
            Object objY5 = bVarI.y();
            if (z6 || objY5 == c0042a) {
                objY5 = new Function1() { // from class: iwh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float fJ;
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        if (z4) {
                            isw iswVar2 = iswVar;
                            fJ = iswVar2.j() < 90.0f ? iswVar2.j() : 180.0f - iswVar2.j();
                        } else {
                            fJ = 0.0f;
                        }
                        a7lVar.q(fJ);
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(d.a.b, (Function1) objY5);
            if (j58Var4 == null) {
                bVarI.N(1127870729);
                j = ((lib0) bVarI.O(oib0.a)).a;
                bVarI.X(false);
            } else {
                bVarI.N(1127869861);
                bVarI.X(false);
                j = j58Var4.a;
            }
            if (imf0Var5 == null) {
                bVarI.N(1127872673);
                imf0 imf0Var6 = ((ijb0) bVarI.O(kjb0.a)).c;
                bVarI.X(false);
                imf0Var4 = imf0Var6;
            } else {
                bVarI.N(1127871681);
                bVarI.X(false);
                imf0Var4 = imf0Var5;
            }
            bVar = bVarI;
            lkf0.d(str3, dVarA, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var4, bVar, 0, 0, 131064);
            imf0Var3 = imf0Var5;
            z3 = z4;
            j58Var3 = j58Var4;
        } else {
            bVar = bVarI;
            bVar.G();
            z3 = z2;
            j58Var3 = j58Var2;
            imf0Var3 = imf0Var2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z3, j58Var3, imf0Var3, i, i2) { // from class: jwh
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ j58 c;
                public final /* synthetic */ imf0 d;
                public final /* synthetic */ int e;

                {
                    this.e = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lwh.a(this.a, this.b, this.c, this.d, (a) obj, iA, this.e);
                    return Unit.a;
                }
            };
        }
    }
}
