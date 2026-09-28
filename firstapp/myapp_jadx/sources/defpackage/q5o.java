package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.social.ShareIntentType;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq5o;", "Lr02;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q5o extends tsl {
    public final q8i0 f;
    public m7o i;
    public v7o v;
    public rdd0 w;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ShareIntentType.values().length];
            try {
                iArr[ShareIntentType.TWITTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareIntentType.FACEBOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareIntentType.WHATSAPP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareIntentType.TELEGRAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return q5o.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? q5o.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public q5o() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.f = new q8i0(jq40.a(y7o.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m0(Picture picture, x1b x1bVar) {
        r5o r5oVar;
        if (x1bVar instanceof r5o) {
            r5oVar = (r5o) x1bVar;
            int i = r5oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r5oVar.c = i - Integer.MIN_VALUE;
            } else {
                r5oVar = new r5o(this, x1bVar);
            }
        } else {
            r5oVar = new r5o(this, x1bVar);
        }
        Object objD = r5oVar.a;
        y5b y5bVar = y5b.a;
        int i2 = r5oVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            s5o s5oVar = new s5o(picture, null);
            r5oVar.c = 1;
            objD = ej5.d(oddVar, s5oVar, r5oVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        objD.getClass();
        return objD;
    }

    public final File n0() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        String str = File.separator;
        o0();
        File file = new File(absolutePath + str + "sportybetImage" + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final m7o o0() {
        m7o m7oVar = this.i;
        if (m7oVar != null) {
            return m7oVar;
        }
        Intrinsics.n("sharingUtils");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(1627083377, new Function2() { // from class: o5o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final q5o q5oVar = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(1112996960, new Function2() { // from class: p5o
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                q5o q5oVar2 = q5oVar;
                                y7o y7oVarQ0 = q5oVar2.q0();
                                boolean zA = aVar2.A(q5oVar2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    t5o t5oVar = new t5o(0, q5oVar2, q5o.class, "onDimAreaClicked", "onDimAreaClicked()V", 0);
                                    aVar2.r(t5oVar);
                                    objY = t5oVar;
                                }
                                Function0 function0 = (Function0) ((chp) objY);
                                boolean zA2 = aVar2.A(q5oVar2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    u5o u5oVar = new u5o(0, q5oVar2, q5o.class, "onCloseIconClicked", "onCloseIconClicked()V", 0);
                                    aVar2.r(u5oVar);
                                    objY2 = u5oVar;
                                }
                                Function0 function1 = (Function0) ((chp) objY2);
                                boolean zA3 = aVar2.A(q5oVar2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    v5o v5oVar = new v5o(1, q5oVar2, q5o.class, "onSaveImageItemClicked", "onSaveImageItemClicked(Landroid/graphics/Picture;)V", 0);
                                    aVar2.r(v5oVar);
                                    objY3 = v5oVar;
                                }
                                Function1 function2 = (Function1) ((chp) objY3);
                                boolean zA4 = aVar2.A(q5oVar2);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    w5o w5oVar = new w5o(0, q5oVar2, q5o.class, "onCopyLinkItemClicked", "onCopyLinkItemClicked()V", 0);
                                    aVar2.r(w5oVar);
                                    objY4 = w5oVar;
                                }
                                Function0 function3 = (Function0) ((chp) objY4);
                                boolean zA5 = aVar2.A(q5oVar2);
                                Object objY5 = aVar2.y();
                                if (zA5 || objY5 == c0042a) {
                                    x5o x5oVar = new x5o(2, q5oVar2, q5o.class, "onShareItemClicked", "onShareItemClicked(Lcom/sporty/android/core/model/social/ShareIntentType;Landroid/graphics/Picture;)V", 0);
                                    aVar2.r(x5oVar);
                                    objY5 = x5oVar;
                                }
                                Function2 function4 = (Function2) ((chp) objY5);
                                boolean zA6 = aVar2.A(q5oVar2);
                                Object objY6 = aVar2.y();
                                if (zA6 || objY6 == c0042a) {
                                    y5o y5oVar = new y5o(0, q5oVar2, q5o.class, "onErrorDialogConfirmButtonClick", "onErrorDialogConfirmButtonClick()V", 0);
                                    aVar2.r(y5oVar);
                                    objY6 = y5oVar;
                                }
                                Function0 function5 = (Function0) ((chp) objY6);
                                boolean zA7 = aVar2.A(q5oVar2);
                                Object objY7 = aVar2.y();
                                if (zA7 || objY7 == c0042a) {
                                    z5o z5oVar = new z5o(0, q5oVar2, q5o.class, "onErrorDialogDismissRequest", "onErrorDialogDismissRequest()V", 0);
                                    aVar2.r(z5oVar);
                                    objY7 = z5oVar;
                                }
                                Function0 function6 = (Function0) ((chp) objY7);
                                boolean zA8 = aVar2.A(q5oVar2);
                                Object objY8 = aVar2.y();
                                if (zA8 || objY8 == c0042a) {
                                    a6o a6oVar = new a6o(0, q5oVar2, q5o.class, "onTypeNotFoundDialogConfirmButtonClick", "onTypeNotFoundDialogConfirmButtonClick()V", 0);
                                    aVar2.r(a6oVar);
                                    objY8 = a6oVar;
                                }
                                Function0 function7 = (Function0) ((chp) objY8);
                                boolean zA9 = aVar2.A(q5oVar2);
                                Object objY9 = aVar2.y();
                                if (zA9 || objY9 == c0042a) {
                                    b6o b6oVar = new b6o(0, q5oVar2, q5o.class, "onTypeNotFoundDialogDismissRequest", "onTypeNotFoundDialogDismissRequest()V", 0);
                                    aVar2.r(b6oVar);
                                    objY9 = b6oVar;
                                }
                                l7o.b(y7oVarQ0, function0, function1, function2, function3, function4, function5, function6, function7, (Function0) ((chp) objY9), aVar2, 8);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setWindowAnimations(R.style.AnimBottom);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        rdd0 rdd0Var = this.w;
        if (rdd0Var == null) {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
        rdd0Var.a(new a5o.j0(0), k00.d);
        y7o y7oVarQ0 = q0();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        y7oVarQ0.x1(contextRequireContext);
    }

    public final v7o p0() {
        v7o v7oVar = this.v;
        if (v7oVar != null) {
            return v7oVar;
        }
        Intrinsics.n("toastUtils");
        throw null;
    }

    public final y7o q0() {
        return (y7o) this.f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r0(Bitmap bitmap, String str, File file, x1b x1bVar) {
        e6o e6oVar;
        if (x1bVar instanceof e6o) {
            e6oVar = (e6o) x1bVar;
            int i = e6oVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e6oVar.d = i - Integer.MIN_VALUE;
            } else {
                e6oVar = new e6o(this, x1bVar);
            }
        } else {
            e6oVar = new e6o(this, x1bVar);
        }
        Object obj = e6oVar.b;
        y5b y5bVar = y5b.a;
        int i2 = e6oVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            File file2 = e6oVar.a;
            uj50.b(obj);
            return file2;
        }
        uj50.b(obj);
        File file3 = new File(file, String.format("%s_%s.png", Arrays.copyOf(new Object[]{"instant_virtual_show_off", str}, 2)));
        pfd pfdVar = fse.a;
        odd oddVar = odd.b;
        f6o f6oVar = new f6o(file3, bitmap, null);
        e6oVar.a = file3;
        e6oVar.d = 1;
        return ej5.d(oddVar, f6oVar, e6oVar) == y5bVar ? y5bVar : file3;
    }

    public final void s0() {
        rdd0 rdd0Var = this.w;
        if (rdd0Var != null) {
            rdd0Var.a(new a5o.i0(0), k00.d);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }
}
