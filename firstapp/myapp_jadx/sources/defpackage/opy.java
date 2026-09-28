package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lopy;", "Ll12;", "Ljct;", "Laxi;", "", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class opy extends l12<jct, axi> {
    public int c;
    public com.sportygames.commons.views.a d;
    public DynamicOnboardingScreenBasicBase[] e = new DynamicOnboardingScreenBasicBase[0];

    @c0d(c = "com.sportygames.commons.views.OnboardingFragment$onResume$1$1", f = "OnboardingFragment.kt", l = {70}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public opy a;
        public DynamicOnboardingScreenBasicBase b;
        public String c;
        public int d;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return opy.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0097 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0014, B:24:0x0084, B:26:0x008d, B:28:0x0097, B:29:0x009e, B:31:0x00a4, B:32:0x00b0, B:34:0x00b6, B:36:0x00ba, B:37:0x00bd, B:39:0x00c1, B:40:0x00c7, B:41:0x00ca, B:13:0x0024, B:15:0x002a, B:17:0x0044, B:18:0x0052, B:20:0x005c), top: B:49:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a4 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0014, B:24:0x0084, B:26:0x008d, B:28:0x0097, B:29:0x009e, B:31:0x00a4, B:32:0x00b0, B:34:0x00b6, B:36:0x00ba, B:37:0x00bd, B:39:0x00c1, B:40:0x00c7, B:41:0x00ca, B:13:0x0024, B:15:0x002a, B:17:0x0044, B:18:0x0052, B:20:0x005c), top: B:49:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00c1 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0014, B:24:0x0084, B:26:0x008d, B:28:0x0097, B:29:0x009e, B:31:0x00a4, B:32:0x00b0, B:34:0x00b6, B:36:0x00ba, B:37:0x00bd, B:39:0x00c1, B:40:0x00c7, B:41:0x00ca, B:13:0x0024, B:15:0x002a, B:17:0x0044, B:18:0x0052, B:20:0x005c), top: B:49:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00c7 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0014, B:24:0x0084, B:26:0x008d, B:28:0x0097, B:29:0x009e, B:31:0x00a4, B:32:0x00b0, B:34:0x00b6, B:36:0x00ba, B:37:0x00bd, B:39:0x00c1, B:40:0x00c7, B:41:0x00ca, B:13:0x0024, B:15:0x002a, B:17:0x0044, B:18:0x0052, B:20:0x005c), top: B:49:0x000a }] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            DynamicOnboardingScreenBasicBase dynamicOnboardingScreenBasicBase;
            String strC;
            opy opyVar;
            Bitmap bitmapDecodeResource;
            opy opyVar2;
            String str;
            axi axiVar;
            axi axiVar2;
            com.sportygames.commons.views.a aVar;
            ConstraintLayout constraintLayout;
            y5b y5bVar = y5b.a;
            int i = this.d;
            opy opyVar3 = opy.this;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    Context context = opyVar3.getContext();
                    if (context != null) {
                        dynamicOnboardingScreenBasicBase = opyVar3.e[opyVar3.c];
                        op5 op5Var = op5.a;
                        strC = op5.c(op5Var, dynamicOnboardingScreenBasicBase.getTEXT_KEY(), dynamicOnboardingScreenBasicBase.getDEFAULT_TEXT());
                        if (dynamicOnboardingScreenBasicBase.getBITMAP_ID() != 0) {
                            bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), dynamicOnboardingScreenBasicBase.getBITMAP_ID());
                            opyVar = opyVar3;
                        } else if (TextUtils.isEmpty(dynamicOnboardingScreenBasicBase.getBITMAP_KEY())) {
                            opyVar = opyVar3;
                            bitmapDecodeResource = null;
                        } else {
                            String strC2 = op5.c(op5Var, dynamicOnboardingScreenBasicBase.getBITMAP_KEY(), dynamicOnboardingScreenBasicBase.getDEFAULT_URL());
                            s4u<String, Bitmap> s4uVar = r9n.a;
                            this.a = opyVar3;
                            this.b = dynamicOnboardingScreenBasicBase;
                            this.c = strC;
                            this.d = 1;
                            pfd pfdVar = fse.a;
                            obj = ej5.d(odd.b, new s9n(null, context, strC2), this);
                            if (obj == y5bVar) {
                                return y5bVar;
                            }
                            opyVar2 = opyVar3;
                            str = strC;
                        }
                        dynamicOnboardingScreenBasicBase.y = bitmapDecodeResource;
                        dynamicOnboardingScreenBasicBase.A = strC;
                        axiVar = (axi) opyVar.b;
                        if (axiVar != null) {
                            axiVar.b.setVisibility(8);
                        }
                        if (dynamicOnboardingScreenBasicBase.getParent() != null) {
                            ViewParent parent = dynamicOnboardingScreenBasicBase.getParent();
                            parent.getClass();
                            ((ViewGroup) parent).removeView(dynamicOnboardingScreenBasicBase);
                        }
                        axiVar2 = (axi) opyVar.b;
                        if (axiVar2 != null && (constraintLayout = axiVar2.c) != null) {
                            constraintLayout.addView(dynamicOnboardingScreenBasicBase);
                        }
                        aVar = opyVar.d;
                        if (aVar == null) {
                            Intrinsics.n("onImageLoadlistener");
                            throw null;
                        }
                        aVar.y0(opyVar.c);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.c;
                dynamicOnboardingScreenBasicBase = this.b;
                opyVar2 = this.a;
                uj50.b(obj);
                Bitmap bitmap = (Bitmap) obj;
                opyVar = opyVar2;
                bitmapDecodeResource = bitmap;
                strC = str;
                dynamicOnboardingScreenBasicBase.y = bitmapDecodeResource;
                dynamicOnboardingScreenBasicBase.A = strC;
                axiVar = (axi) opyVar.b;
                if (axiVar != null) {
                    axiVar.b.setVisibility(8);
                }
                if (dynamicOnboardingScreenBasicBase.getParent() != null) {
                    ViewParent parent2 = dynamicOnboardingScreenBasicBase.getParent();
                    parent2.getClass();
                    ((ViewGroup) parent2).removeView(dynamicOnboardingScreenBasicBase);
                }
                axiVar2 = (axi) opyVar.b;
                if (axiVar2 != null) {
                    constraintLayout.addView(dynamicOnboardingScreenBasicBase);
                }
                aVar = opyVar.d;
                if (aVar == null) {
                    aVar.y0(opyVar.c);
                    return Unit.a;
                }
                Intrinsics.n("onImageLoadlistener");
                throw null;
            } catch (Exception e) {
                e.printStackTrace();
                com.sportygames.commons.views.a aVar2 = opyVar3.d;
                if (aVar2 == null) {
                    Intrinsics.n("onImageLoadlistener");
                    throw null;
                }
                aVar2.v0(false);
            }
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        return axi.a(getLayoutInflater().inflate(R.layout.fragment_on_boarding, (ViewGroup) null, false));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            if (isDetached() || !isVisible()) {
                return;
            }
            axi axiVar = (axi) this.b;
            if (axiVar != null) {
                axiVar.b.setVisibility(0);
            }
            axi axiVar2 = (axi) this.b;
            if (axiVar2 == null || axiVar2.c == null) {
                return;
            }
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new a(null), 3);
        } catch (Exception e) {
            e.printStackTrace();
            com.sportygames.commons.views.a aVar = this.d;
            if (aVar != null) {
                aVar.v0(false);
            } else {
                Intrinsics.n("onImageLoadlistener");
                throw null;
            }
        }
    }
}
