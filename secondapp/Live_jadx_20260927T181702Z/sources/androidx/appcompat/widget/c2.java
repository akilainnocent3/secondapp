package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c2 extends f2.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f7005k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f7006l = "share_history.xml";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f7008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f7009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f7010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f7011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.appcompat.widget.c.f f7012j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        boolean a(c2 c2Var, Intent intent);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements androidx.appcompat.widget.c.f {
        public b() {
        }

        @Override // androidx.appcompat.widget.c.f
        public boolean a(androidx.appcompat.widget.c cVar, Intent intent) {
            c2 c2Var = c2.this;
            a aVar = c2Var.f7011i;
            if (aVar == null) {
                return false;
            }
            aVar.a(c2Var, intent);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements MenuItem.OnMenuItemClickListener {
        public c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            c2 c2Var = c2.this;
            Intent intentB = androidx.appcompat.widget.c.d(c2Var.f7009g, c2Var.f7010h).b(menuItem.getItemId());
            if (intentB == null) {
                return true;
            }
            String action = intentB.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                c2.this.r(intentB);
            }
            c2.this.f7009g.startActivity(intentB);
            return true;
        }
    }

    public c2(Context context) {
        super(context);
        this.f7007e = 4;
        this.f7008f = new c();
        this.f7010h = f7006l;
        this.f7009g = context;
    }

    @Override // f2.b
    public boolean b() {
        return true;
    }

    @Override // f2.b
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f7009g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.c.d(this.f7009g, this.f7010h));
        }
        TypedValue typedValue = new TypedValue();
        this.f7009g.getTheme().resolveAttribute(m.a.b.A, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(n.a.b(this.f7009g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(m.a.k.f105804z);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(m.a.k.f105803y);
        return activityChooserView;
    }

    @Override // f2.b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.c cVarD = androidx.appcompat.widget.c.d(this.f7009g, this.f7010h);
        PackageManager packageManager = this.f7009g.getPackageManager();
        int iF = cVarD.f();
        int iMin = Math.min(iF, this.f7007e);
        for (int i10 = 0; i10 < iMin; i10++) {
            ResolveInfo resolveInfoE = cVarD.e(i10);
            subMenu.add(0, i10, i10, resolveInfoE.loadLabel(packageManager)).setIcon(resolveInfoE.loadIcon(packageManager)).setOnMenuItemClickListener(this.f7008f);
        }
        if (iMin < iF) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.f7009g.getString(m.a.k.f105783e));
            for (int i11 = 0; i11 < iF; i11++) {
                ResolveInfo resolveInfoE2 = cVarD.e(i11);
                subMenuAddSubMenu.add(0, i11, i11, resolveInfoE2.loadLabel(packageManager)).setIcon(resolveInfoE2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f7008f);
            }
        }
    }

    public final void n() {
        if (this.f7011i == null) {
            return;
        }
        if (this.f7012j == null) {
            this.f7012j = new b();
        }
        androidx.appcompat.widget.c.d(this.f7009g, this.f7010h).u(this.f7012j);
    }

    public void o(a aVar) {
        this.f7011i = aVar;
        n();
    }

    public void p(String str) {
        this.f7010h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        androidx.appcompat.widget.c.d(this.f7009g, this.f7010h).t(intent);
    }

    public void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
