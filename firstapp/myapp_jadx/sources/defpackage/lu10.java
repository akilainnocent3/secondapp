package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llu10;", "Ll12;", "Lc760;", "Ls820;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class lu10 extends l12<c760, s820> {
    public j1b c;
    public boolean d;
    public int e;
    public int f;
    public boolean i;
    public boolean v;
    public boolean w;
    public boolean y;

    @c0d(c = "com.sportygames.pocketrocket.views.PocketRocketChatComponentFragment$onViewCreated$1", f = "PocketRocketChatComponentFragment.kt", l = {57, 63, 69}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public AppCompatImageView a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return lu10.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:24:0x006e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0074  */
        /* JADX WARN: Code duplicated, block: B:29:0x0089  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r8 == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        
            if (r8 == r0) goto L28;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.b
                r2 = 3
                r3 = 2
                r4 = 1
                lu10 r5 = defpackage.lu10.this
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L18
                androidx.appcompat.widget.AppCompatImageView r7 = r7.a
                defpackage.uj50.b(r8)
                goto L8c
            L18:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L1f:
                androidx.appcompat.widget.AppCompatImageView r1 = r7.a
                defpackage.uj50.b(r8)
                goto L69
            L25:
                androidx.appcompat.widget.AppCompatImageView r1 = r7.a
                defpackage.uj50.b(r8)
                goto L49
            L2b:
                defpackage.uj50.b(r8)
                B extends g6i0 r8 = r5.b
                s820 r8 = (defpackage.s820) r8
                if (r8 == 0) goto L4e
                androidx.appcompat.widget.AppCompatImageView r1 = r8.B
                s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
                android.content.Context r8 = r5.getContext()
                r7.a = r1
                r7.b = r4
                java.lang.String r4 = "red_rocket_with_fire_png"
                java.lang.Object r8 = defpackage.r9n.c(r7, r8, r4)
                if (r8 != r0) goto L49
                goto L88
            L49:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r1.setImageBitmap(r8)
            L4e:
                B extends g6i0 r8 = r5.b
                s820 r8 = (defpackage.s820) r8
                if (r8 == 0) goto L6e
                androidx.appcompat.widget.AppCompatImageView r1 = r8.A
                s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
                android.content.Context r8 = r5.getContext()
                r7.a = r1
                r7.b = r3
                java.lang.String r3 = "purple_rocket_with_fire_png"
                java.lang.Object r8 = defpackage.r9n.c(r7, r8, r3)
                if (r8 != r0) goto L69
                goto L88
            L69:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r1.setImageBitmap(r8)
            L6e:
                B extends g6i0 r8 = r5.b
                s820 r8 = (defpackage.s820) r8
                if (r8 == 0) goto L91
                androidx.appcompat.widget.AppCompatImageView r8 = r8.b
                s4u<java.lang.String, android.graphics.Bitmap> r1 = defpackage.r9n.a
                android.content.Context r1 = r5.getContext()
                r7.a = r8
                r7.b = r2
                java.lang.String r2 = "blue_rocket_with_fire_png"
                java.lang.Object r7 = defpackage.r9n.c(r7, r1, r2)
                if (r7 != r0) goto L89
            L88:
                return r0
            L89:
                r6 = r8
                r8 = r7
                r7 = r6
            L8c:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r7.setImageBitmap(r8)
            L91:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: lu10.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
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

    public lu10() {
        pfd pfdVar = fse.a;
        this.c = w5b.a(gku.a);
        this.i = true;
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.pr_chat_layout, (ViewGroup) null, false);
        int i = R.id.blue_rocket_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.blue_rocket_image, viewInflate);
        if (appCompatImageView != null) {
            i = R.id.cashout1;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.cashout1, viewInflate);
            if (constraintLayout != null) {
                i = R.id.cashout2;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.cashout2, viewInflate);
                if (constraintLayout2 != null) {
                    i = R.id.cashout3;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.cashout3, viewInflate);
                    if (constraintLayout3 != null) {
                        i = R.id.cashout_layout;
                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.cashout_layout, viewInflate);
                        if (linearLayout != null) {
                            i = R.id.cashout_text1;
                            TextView textView = (TextView) h5e.a(R.id.cashout_text1, viewInflate);
                            if (textView != null) {
                                i = R.id.cashout_text2;
                                TextView textView2 = (TextView) h5e.a(R.id.cashout_text2, viewInflate);
                                if (textView2 != null) {
                                    i = R.id.cashout_text3;
                                    TextView textView3 = (TextView) h5e.a(R.id.cashout_text3, viewInflate);
                                    if (textView3 != null) {
                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate;
                                        i = R.id.coefficient;
                                        TextView textView4 = (TextView) h5e.a(R.id.coefficient, viewInflate);
                                        if (textView4 != null) {
                                            i = R.id.powering;
                                            TextView textView5 = (TextView) h5e.a(R.id.powering, viewInflate);
                                            if (textView5 != null) {
                                                i = R.id.purple_rocket_image;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.purple_rocket_image, viewInflate);
                                                if (appCompatImageView2 != null) {
                                                    i = R.id.red_rocket_image;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.red_rocket_image, viewInflate);
                                                    if (appCompatImageView3 != null) {
                                                        i = R.id.seekbar;
                                                        SeekBar seekBar = (SeekBar) h5e.a(R.id.seekbar, viewInflate);
                                                        if (seekBar != null) {
                                                            i = R.id.waiting_text_layout;
                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.waiting_text_layout, viewInflate);
                                                            if (constraintLayout5 != null) {
                                                                return new s820(constraintLayout4, appCompatImageView, constraintLayout, constraintLayout2, constraintLayout3, linearLayout, textView, textView2, textView3, textView4, textView5, appCompatImageView2, appCompatImageView3, seekBar, constraintLayout5);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("currency");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        s820 s820Var = (s820) this.b;
        if (s820Var != null) {
            s820Var.f.setVisibility(8);
        }
        s820 s820Var2 = (s820) this.b;
        if (s820Var2 != null) {
            s820Var2.D.setVisibility(8);
        }
        s820 s820Var3 = (s820) this.b;
        if (s820Var3 != null) {
            s820Var3.y.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        s820 s820Var;
        s820 s820Var2;
        s820 s820Var3;
        view.getClass();
        super.onViewCreated(view, bundle);
        int i = 0;
        fb7.d.f(getViewLifecycleOwner(), new b(new hu10(this, i)));
        s820 s820Var4 = (s820) this.b;
        if ((s820Var4 == null || s820Var4.c.getVisibility() != 0) && (((s820Var = (s820) this.b) == null || s820Var.d.getVisibility() != 0) && ((s820Var2 = (s820) this.b) == null || s820Var2.e.getVisibility() != 0))) {
            s820 s820Var5 = (s820) this.b;
            if (s820Var5 != null) {
                s820Var5.f.setVisibility(8);
            }
        } else {
            s820 s820Var6 = (s820) this.b;
            if (s820Var6 != null) {
                s820Var6.f.setVisibility(0);
            }
        }
        s820 s820Var7 = (s820) this.b;
        if (s820Var7 != null) {
            gr60.a(s820Var7.c, new iu10(this, i));
        }
        s820 s820Var8 = (s820) this.b;
        if (s820Var8 != null) {
            gr60.a(s820Var8.d, new xee(this, 2));
        }
        s820 s820Var9 = (s820) this.b;
        if (s820Var9 != null) {
            gr60.a(s820Var9.e, new Function1() { // from class: ju10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    lu10 lu10Var = this.a;
                    s820 s820Var10 = (s820) lu10Var.b;
                    if (s820Var10 != null) {
                        s820Var10.e.setClickable(false);
                    }
                    s820 s820Var11 = (s820) lu10Var.b;
                    if (s820Var11 != null) {
                        s820Var11.e.setAlpha(0.5f);
                    }
                    fb7.c.j(Boolean.TRUE);
                    return Unit.a;
                }
            });
        }
        mqw.a.f(getViewLifecycleOwner(), new b(new tee(this, 1)));
        op5 op5Var = op5.a;
        s820 s820Var10 = (s820) this.b;
        op5.r(op5Var, kotlin.collections.b.f(s820Var10 != null ? s820Var10.z : null), null, 6);
        if (Build.VERSION.SDK_INT <= 25 && (s820Var3 = (s820) this.b) != null) {
            s820Var3.z.setTextSize(17.0f);
        }
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new a(null), 3);
    }
}
