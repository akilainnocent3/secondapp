package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.sportybet.android.gp.tz.R;
import defpackage.g9i0;
import defpackage.r6i0;
import defpackage.xq0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends xq0 implements DialogInterface {
    public final AlertController f;

    public b(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, g(contextThemeWrapper, i));
        this.f = new AlertController(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button f(int i) {
        AlertController alertController = this.f;
        if (i == -3) {
            return alertController.p;
        }
        if (i == -2) {
            return alertController.m;
        }
        if (i == -1) {
            return alertController.j;
        }
        alertController.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.xq0, defpackage.bo8, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f;
        alertController.b.setContentView(alertController.A);
        Context context = alertController.a;
        Window window = alertController.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View viewInflate = alertController.g;
        if (viewInflate == null) {
            viewInflate = alertController.h != 0 ? LayoutInflater.from(context).inflate(alertController.h, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.s = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.s.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        alertController.w = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.s.removeView(alertController.w);
                if (alertController.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.s.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.s);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        alertController.j = button;
        AlertController.a aVar = alertController.G;
        button.setOnClickListener(aVar);
        boolean zIsEmpty = TextUtils.isEmpty(alertController.k);
        Button button2 = alertController.j;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(alertController.k);
            alertController.j.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        alertController.m = button3;
        button3.setOnClickListener(aVar);
        boolean zIsEmpty2 = TextUtils.isEmpty(alertController.n);
        Button button4 = alertController.m;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(alertController.n);
            alertController.m.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        alertController.p = button5;
        button5.setOnClickListener(aVar);
        boolean zIsEmpty3 = TextUtils.isEmpty(alertController.q);
        Button button6 = alertController.p;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(alertController.q);
            alertController.p.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = alertController.j;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = alertController.m;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = alertController.p;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (alertController.x != null) {
            viewGroupB.addView(alertController.x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.u = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(alertController.d) || !alertController.E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.u.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.v = textView2;
                textView2.setText(alertController.d);
                Drawable drawable = alertController.t;
                if (drawable != null) {
                    alertController.u.setImageDrawable(drawable);
                } else {
                    alertController.v.setPadding(alertController.u.getPaddingLeft(), alertController.u.getPaddingTop(), alertController.u.getPaddingRight(), alertController.u.getPaddingBottom());
                    alertController.u.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupB3.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView2 = alertController.s;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.e == null && alertController.f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f;
        if (recycleListView != null) {
            recycleListView.setHasDecor(z3, z4);
        }
        if (!z2) {
            View view = alertController.f;
            if (view == null) {
                view = alertController.s;
            }
            if (view != null) {
                int i2 = z4 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                r6i0.e.b(view, z3 | i2, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f;
        if (recycleListView2 == null || (listAdapter = alertController.y) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i3 = alertController.z;
        if (i3 > -1) {
            recycleListView2.setItemChecked(i3, true);
            recycleListView2.setSelection(i3);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.s;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.s;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.xq0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f;
        alertController.d = charSequence;
        TextView textView = alertController.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public static class a {
        public final AlertController.b a;
        public final int b;

        public a(Context context, int i) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, b.g(context, i)));
            this.b = i;
        }

        public final void a(int i) {
            AlertController.b bVar = this.a;
            bVar.f = bVar.a.getText(i);
        }

        public final void b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = charSequence;
            bVar.j = onClickListener;
        }

        public final void c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.g = charSequence;
            bVar.h = onClickListener;
        }

        public b create() {
            AlertController.b bVar = this.a;
            b bVar2 = new b(bVar.a, this.b);
            View view = bVar.e;
            AlertController alertController = bVar2.f;
            if (view != null) {
                alertController.x = view;
            } else {
                CharSequence charSequence = bVar.d;
                if (charSequence != null) {
                    alertController.d = charSequence;
                    TextView textView = alertController.v;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.c;
                if (drawable != null) {
                    alertController.t = drawable;
                    ImageView imageView = alertController.u;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.u.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f;
            if (charSequence2 != null) {
                alertController.e = charSequence2;
                TextView textView2 = alertController.w;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.g;
            if (charSequence3 != null) {
                alertController.c(-1, charSequence3, bVar.h);
            }
            CharSequence charSequence4 = bVar.i;
            if (charSequence4 != null) {
                alertController.c(-2, charSequence4, bVar.j);
            }
            if (bVar.o != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.B, (ViewGroup) null);
                int i = bVar.s ? alertController.C : alertController.D;
                ListAdapter dVar = bVar.o;
                if (dVar == null) {
                    dVar = new AlertController.d(bVar.a, i, android.R.id.text1, null);
                }
                alertController.y = dVar;
                alertController.z = bVar.t;
                if (bVar.p != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar, alertController));
                }
                if (bVar.s) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f = recycleListView;
            }
            View view2 = bVar.r;
            if (view2 != null) {
                alertController.g = view2;
                alertController.h = 0;
                alertController.i = false;
            } else {
                int i2 = bVar.q;
                if (i2 != 0) {
                    alertController.g = null;
                    alertController.h = i2;
                    alertController.i = false;
                }
            }
            bVar2.setCancelable(bVar.k);
            if (bVar.k) {
                bVar2.setCanceledOnTouchOutside(true);
            }
            bVar2.setOnCancelListener(bVar.l);
            bVar2.setOnDismissListener(bVar.m);
            g gVar = bVar.n;
            if (gVar != null) {
                bVar2.setOnKeyListener(gVar);
            }
            return bVar2;
        }

        public final void d(int i) {
            AlertController.b bVar = this.a;
            bVar.d = bVar.a.getText(i);
        }

        public final void e(int i) {
            AlertController.b bVar = this.a;
            bVar.r = null;
            bVar.q = i;
        }

        public final b f() {
            b bVarCreate = create();
            bVarCreate.show();
            return bVarCreate;
        }

        public Context getContext() {
            return this.a.a;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = bVar.a.getText(i);
            bVar.j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.g = bVar.a.getText(i);
            bVar.h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.a.d = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.a;
            bVar.r = view;
            bVar.q = 0;
            return this;
        }

        public a(Context context) {
            this(context, b.g(context, 0));
        }
    }
}
