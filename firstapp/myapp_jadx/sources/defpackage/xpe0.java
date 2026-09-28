package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xpe0 {
    public final a a;
    public final ArrayList<c> b = new ArrayList<>();
    public ymn c;
    public ymn d;
    public int e;

    public class a extends View {
        public final /* synthetic */ ViewGroup a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ViewGroup viewGroup) {
            super(context);
            this.a = viewGroup;
        }

        @Override // android.view.View
        public final void onConfigurationChanged(Configuration configuration) {
            xpe0 xpe0Var = xpe0.this;
            ArrayList<c> arrayList = xpe0Var.b;
            Drawable background = this.a.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (xpe0Var.e != color) {
                xpe0Var.e = color;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).e();
                }
            }
        }
    }

    public class b extends h8j0.b {
        public final HashMap<h8j0, Integer> c;

        public b() {
            super(0);
            this.c = new HashMap<>();
        }

        @Override // h8j0.b
        public final void a(h8j0 h8j0Var) {
            ArrayList<c> arrayList = xpe0.this.b;
            if ((h8j0Var.a.d() & 519) != 0) {
                this.c.remove(h8j0Var);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a();
                }
            }
        }

        @Override // h8j0.b
        public final void c(h8j0 h8j0Var) {
            ArrayList<c> arrayList = xpe0.this.b;
            if ((h8j0Var.a.d() & 519) != 0) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).c();
                }
            }
        }

        @Override // h8j0.b
        public final l8j0 d(l8j0 l8j0Var, List<h8j0> list) {
            ArrayList<c> arrayList = xpe0.this.b;
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            for (int size = list.size() - 1; size >= 0; size--) {
                h8j0 h8j0Var = list.get(size);
                Integer num = this.c.get(h8j0Var);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fA = h8j0Var.a.a();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fA;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fA;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fA;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fA;
                    }
                }
            }
            ymn.b(l8j0Var.a.g(519), l8j0Var.a.g(64));
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).f();
            }
            return l8j0Var;
        }

        @Override // h8j0.b
        public final h8j0.a e(h8j0 h8j0Var, h8j0.a aVar) {
            if ((h8j0Var.a.d() & 519) != 0) {
                ymn ymnVar = aVar.b;
                ymn ymnVar2 = aVar.a;
                int i = ymnVar.a != ymnVar2.a ? 1 : 0;
                if (ymnVar.b != ymnVar2.b) {
                    i |= 2;
                }
                if (ymnVar.c != ymnVar2.c) {
                    i |= 4;
                }
                if (ymnVar.d != ymnVar2.d) {
                    i |= 8;
                }
                this.c.put(h8j0Var, Integer.valueOf(i));
            }
            return aVar;
        }
    }

    public interface c {
        void a();

        void c();

        void d(ymn ymnVar, ymn ymnVar2);

        void e();

        void f();
    }

    public xpe0(ViewGroup viewGroup) {
        ymn ymnVar = ymn.e;
        this.c = ymnVar;
        this.d = ymnVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.a = aVar;
        aVar.setWillNotDraw(true);
        zmy zmyVar = new zmy() { // from class: vpe0
            @Override // defpackage.zmy
            public final l8j0 b(View view, l8j0 l8j0Var) {
                xpe0 xpe0Var = this.a;
                ArrayList<xpe0.c> arrayList = xpe0Var.b;
                l8j0.l lVar = l8j0Var.a;
                ymn ymnVarB = ymn.b(lVar.g(519), lVar.g(64));
                ymn ymnVarB2 = ymn.b(lVar.h(519), lVar.h(64));
                if (!ymnVarB.equals(xpe0Var.c) || !ymnVarB2.equals(xpe0Var.d)) {
                    xpe0Var.c = ymnVarB;
                    xpe0Var.d = ymnVarB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        arrayList.get(size).d(ymnVarB, ymnVarB2);
                    }
                }
                return l8j0Var;
            }
        };
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(aVar, zmyVar);
        h8j0.a(aVar, new b());
        viewGroup.addView(aVar, 0);
    }
}
