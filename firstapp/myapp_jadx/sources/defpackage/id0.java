package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class id0 {
    public static final void a(gaj gajVar, d dVar, Function1 function1, a aVar, final int i) {
        int i2;
        final gaj gajVar2;
        final d dVar2;
        final Function1 function2;
        b bVarI = aVar.i(-1985291610);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(gajVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            gajVar2 = gajVar;
            dVar2 = dVar;
            function2 = function1;
            b(gajVar2, dVar2, null, function2, bVarI, (i2 & 14) | 384 | (i2 & 112) | ((i2 << 6) & 57344));
        } else {
            gajVar2 = gajVar;
            dVar2 = dVar;
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    id0.a(gajVar2, dVar2, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final gaj gajVar, final d dVar, Function1 function1, final Function1 function2, a aVar, final int i) {
        int i2;
        final Function1 function3;
        b bVarI = aVar.i(509101952);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(gajVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(null) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function2) ? 16384 : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new bd0();
                bVarI.r(objY);
            }
            function3 = (Function1) objY;
            View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            boolean zM = bVarI.M(view);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                try {
                    Fragment fragmentI = FragmentManager.I(view);
                    if (fragmentI == null) {
                        throw new IllegalStateException("View " + view + " does not have a Fragment set");
                    }
                    objY2 = fragmentI;
                } catch (IllegalStateException unused) {
                    objY2 = null;
                }
                bVarI.r(objY2);
            }
            final Fragment fragment = (Fragment) objY2;
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean zA = ((i3 & 14) == 4) | bVarI.A(fragment);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new Function1() { // from class: cd0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LayoutInflater layoutInflaterFrom;
                        Context context2 = (Context) obj;
                        Fragment fragment2 = fragment;
                        if (fragment2 == null || (layoutInflaterFrom = fragment2.getLayoutInflater()) == null) {
                            layoutInflaterFrom = LayoutInflater.from(context2);
                        }
                        g6i0 g6i0Var = (g6i0) gajVar.invoke(layoutInflaterFrom, new FrameLayout(context2), Boolean.FALSE);
                        View root = g6i0Var.getRoot();
                        root.setTag(R.id.binding_reference, g6i0Var);
                        return root;
                    }
                };
                bVarI.r(objY3);
            }
            Function1 function4 = (Function1) objY3;
            bVarI.N(1128086696);
            bVarI.X(false);
            boolean zA2 = ((i3 & 7168) == 2048) | bVarI.A(fragment) | bVarI.A(context);
            Object objY4 = bVarI.y();
            if (zA2 || objY4 == c0042a) {
                objY4 = new Function1() { // from class: dd0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        FragmentManager childFragmentManager;
                        View view2 = (View) obj;
                        Object tag = view2.getTag(R.id.binding_reference);
                        tag.getClass();
                        function3.invoke((g6i0) tag);
                        FragmentManager supportFragmentManager = null;
                        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                        if (viewGroup != null) {
                            Fragment fragment2 = fragment;
                            if (fragment2 == null || (childFragmentManager = fragment2.getChildFragmentManager()) == null) {
                                Context context2 = context;
                                androidx.fragment.app.e eVar = context2 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) context2 : null;
                                if (eVar != null) {
                                    supportFragmentManager = eVar.getSupportFragmentManager();
                                }
                            } else {
                                supportFragmentManager = childFragmentManager;
                            }
                            id0.c(viewGroup, new gd0(supportFragmentManager, 0));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            Function1 function5 = (Function1) objY4;
            boolean z = (57344 & i3) == 16384;
            Object objY5 = bVarI.y();
            if (z || objY5 == c0042a) {
                objY5 = new ed0(function2, 0);
                bVarI.r(objY5);
            }
            androidx.compose.ui.viewinterop.b.b(function4, dVar, null, function5, (Function1) objY5, bVarI, i3 & 112, 0);
        } else {
            bVarI.G();
            function3 = function1;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    id0.b(gajVar, dVar, function3, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(ViewGroup viewGroup, gd0 gd0Var) {
        if (viewGroup instanceof FragmentContainerView) {
            gd0Var.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt, gd0Var);
            }
        }
    }
}
