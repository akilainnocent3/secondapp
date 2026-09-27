package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import f2.d2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class e implements p1.a {
    public static final String L = "MenuBuilder";
    public static final String M = "android:menu:presenters";
    public static final String N = "android:menu:actionviewstates";
    public static final String O = "android:menu:expandedactionview";
    public static final int[] P = {1, 4, 5, 3, 2, 0};
    public View A;
    public h I;
    public boolean K;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f6574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Resources f6575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6576n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f6578p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f6586x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f6587y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f6588z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6585w = 0;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public ArrayList<h> G = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<j>> H = new CopyOnWriteArrayList<>();
    public boolean J = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<h> f6579q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<h> f6580r = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6581s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<h> f6582t = new ArrayList<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<h> f6583u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6584v = true;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a(@NonNull e eVar, @NonNull MenuItem menuItem);

        void b(@NonNull e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public interface b {
        boolean b(h hVar);
    }

    public e(Context context) {
        this.f6574l = context;
        this.f6575m = context.getResources();
        l0(true);
    }

    public static int E(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = P;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int q(ArrayList<h> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.f6587y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList<h> C() {
        u();
        return this.f6583u;
    }

    public boolean D() {
        return this.E;
    }

    public Resources F() {
        return this.f6575m;
    }

    @NonNull
    public ArrayList<h> H() {
        if (!this.f6581s) {
            return this.f6580r;
        }
        this.f6580r.clear();
        int size = this.f6579q.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f6579q.get(i10);
            if (hVar.isVisible()) {
                this.f6580r.add(hVar);
            }
        }
        this.f6581s = false;
        this.f6584v = true;
        return this.f6580r;
    }

    public boolean I() {
        return !this.B;
    }

    public boolean J() {
        return this.J;
    }

    public boolean K() {
        return this.f6576n;
    }

    public boolean L() {
        return this.f6577o;
    }

    public void M(h hVar) {
        this.f6584v = true;
        O(true);
    }

    public void N(h hVar) {
        this.f6581s = true;
        O(true);
    }

    public void O(boolean z10) {
        if (this.B) {
            this.C = true;
            if (z10) {
                this.D = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f6581s = true;
            this.f6584v = true;
        }
        j(z10);
    }

    public boolean P(MenuItem menuItem, int i10) {
        return Q(menuItem, null, i10);
    }

    public boolean Q(MenuItem menuItem, j jVar, int i10) {
        h hVar = (h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        boolean zN = hVar.n();
        f2.b bVarB = hVar.b();
        boolean z10 = bVarB != null && bVarB.b();
        if (hVar.m()) {
            boolean zExpandActionView = hVar.expandActionView() | zN;
            if (zExpandActionView) {
                f(true);
            }
            return zExpandActionView;
        }
        if (!hVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                f(true);
            }
            return zN;
        }
        if ((i10 & 4) == 0) {
            f(false);
        }
        if (!hVar.hasSubMenu()) {
            hVar.A(new m(x(), this, hVar));
        }
        m mVar = (m) hVar.getSubMenu();
        if (z10) {
            bVarB.g(mVar);
        }
        boolean zM = m(mVar, jVar) | zN;
        if (!zM) {
            f(true);
        }
        return zM;
    }

    public void R(int i10) {
        S(i10, true);
    }

    public final void S(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f6579q.size()) {
            return;
        }
        this.f6579q.remove(i10);
        if (z10) {
            O(true);
        }
    }

    public void T(j jVar) {
        for (WeakReference<j> weakReference : this.H) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.H.remove(weakReference);
            }
        }
    }

    public void U(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(w());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).U(bundle);
            }
        }
        int i11 = bundle.getInt(O);
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(O, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).W(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void X(Bundle bundle) {
        l(bundle);
    }

    public void Y(a aVar) {
        this.f6578p = aVar;
    }

    public void Z(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f6586x = contextMenuInfo;
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iE = E(i12);
        h hVarH = h(i10, i11, i12, iE, charSequence, this.f6585w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f6586x;
        if (contextMenuInfo != null) {
            hVarH.y(contextMenuInfo);
        }
        ArrayList<h> arrayList = this.f6579q;
        arrayList.add(q(arrayList, iE), hVarH);
        O(true);
        return hVarH;
    }

    public e a0(int i10) {
        this.f6585w = i10;
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f6574l.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f6574l);
    }

    public void b0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f6579q.size();
        n0();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f6579q.get(i10);
            if (hVar.getGroupId() == groupId && hVar.p() && hVar.isCheckable()) {
                hVar.v(hVar == menuItem);
            }
        }
        m0();
    }

    public void c(j jVar, Context context) {
        this.H.add(new WeakReference<>(jVar));
        jVar.g(context, this);
        this.f6584v = true;
    }

    public e c0(int i10) {
        e0(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        h hVar = this.I;
        if (hVar != null) {
            g(hVar);
        }
        this.f6579q.clear();
        O(true);
    }

    public void clearHeader() {
        this.f6588z = null;
        this.f6587y = null;
        this.A = null;
        O(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.f6578p;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public e d0(Drawable drawable) {
        e0(0, null, 0, drawable, null);
        return this;
    }

    public void e() {
        this.B = true;
        clear();
        clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        O(true);
    }

    public final void e0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesF = F();
        if (view != null) {
            this.A = view;
            this.f6587y = null;
            this.f6588z = null;
        } else {
            if (i10 > 0) {
                this.f6587y = resourcesF.getText(i10);
            } else if (charSequence != null) {
                this.f6587y = charSequence;
            }
            if (i11 > 0) {
                this.f6588z = f1.d.getDrawable(x(), i11);
            } else if (drawable != null) {
                this.f6588z = drawable;
            }
            this.A = null;
        }
        O(false);
    }

    public final void f(boolean z10) {
        if (this.F) {
            return;
        }
        this.F = true;
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.H.remove(weakReference);
            } else {
                jVar.a(this, z10);
            }
        }
        this.F = false;
    }

    public e f0(int i10) {
        e0(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f6579q.get(i11);
            if (hVar.getItemId() == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (menuItemFindItem = hVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(h hVar) {
        boolean zF = false;
        if (!this.H.isEmpty() && this.I == hVar) {
            n0();
            for (WeakReference<j> weakReference : this.H) {
                j jVar = weakReference.get();
                if (jVar != null) {
                    zF = jVar.f(this, hVar);
                    if (zF) {
                        break;
                    }
                } else {
                    this.H.remove(weakReference);
                }
            }
            m0();
            if (zF) {
                this.I = null;
            }
        }
        return zF;
    }

    public e g0(CharSequence charSequence) {
        e0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f6579q.get(i10);
    }

    public final h h(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new h(this, i10, i11, i12, i13, charSequence, i14);
    }

    public e h0(View view) {
        e0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f6579q.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean i(@NonNull e eVar, @NonNull MenuItem menuItem) {
        a aVar = this.f6578p;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void i0(boolean z10) {
        this.E = z10;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return s(i10, keyEvent) != null;
    }

    public final void j(boolean z10) {
        if (this.H.isEmpty()) {
            return;
        }
        n0();
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.H.remove(weakReference);
            } else {
                jVar.d(z10);
            }
        }
        m0();
    }

    public void j0(boolean z10) {
        this.K = z10;
    }

    public final void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(M);
        if (sparseParcelableArray == null || this.H.isEmpty()) {
            return;
        }
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.H.remove(weakReference);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    jVar.i(parcelable);
                }
            }
        }
    }

    public void k0(boolean z10) {
        if (this.f6577o == z10) {
            return;
        }
        l0(z10);
        O(false);
    }

    public final void l(Bundle bundle) {
        Parcelable parcelableC;
        if (this.H.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.H.remove(weakReference);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelableC = jVar.c()) != null) {
                    sparseArray.put(id2, parcelableC);
                }
            }
        }
        bundle.putSparseParcelableArray(M, sparseArray);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final void l0(boolean z10) {
        boolean z11;
        if (z10) {
            z11 = this.f6575m.getConfiguration().keyboard != 1 && d2.n(ViewConfiguration.get(this.f6574l), this.f6574l);
        }
        this.f6577o = z11;
    }

    public final boolean m(m mVar, j jVar) {
        if (this.H.isEmpty()) {
            return false;
        }
        boolean zJ = jVar != null ? jVar.j(mVar) : false;
        for (WeakReference<j> weakReference : this.H) {
            j jVar2 = weakReference.get();
            if (jVar2 == null) {
                this.H.remove(weakReference);
            } else if (!zJ) {
                zJ = jVar2.j(mVar);
            }
        }
        return zJ;
    }

    public void m0() {
        this.B = false;
        if (this.C) {
            this.C = false;
            O(this.D);
        }
    }

    public boolean n(h hVar) {
        boolean zB = false;
        if (this.H.isEmpty()) {
            return false;
        }
        n0();
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar != null) {
                zB = jVar.b(this, hVar);
                if (zB) {
                    break;
                }
            } else {
                this.H.remove(weakReference);
            }
        }
        m0();
        if (zB) {
            this.I = hVar;
        }
        return zB;
    }

    public void n0() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.C = false;
        this.D = false;
    }

    public int o(int i10) {
        return p(i10, 0);
    }

    public int p(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f6579q.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return P(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        h hVarS = s(i10, keyEvent);
        boolean zP = hVarS != null ? P(hVarS, i11) : false;
        if ((i11 & 2) != 0) {
            f(true);
        }
        return zP;
    }

    public int r(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f6579q.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iO = o(i10);
        if (iO >= 0) {
            int size = this.f6579q.size() - iO;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f6579q.get(iO).getGroupId() != i10) {
                    break;
                }
                S(iO, false);
                i11 = i12;
            }
            O(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        S(r(i10), true);
    }

    public h s(int i10, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.G;
        arrayList.clear();
        t(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zK = K();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            char alphabeticShortcut = zK ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zK && alphabeticShortcut == '\b' && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f6579q.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f6579q.get(i11);
            if (hVar.getGroupId() == i10) {
                hVar.w(z11);
                hVar.setCheckable(z10);
            }
        }
    }

    @Override // p1.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.J = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f6579q.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f6579q.get(i11);
            if (hVar.getGroupId() == i10) {
                hVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f6579q.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f6579q.get(i11);
            if (hVar.getGroupId() == i10 && hVar.B(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            O(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f6576n = z10;
        O(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f6579q.size();
    }

    public void t(List<h> list, int i10, KeyEvent keyEvent) {
        boolean zK = K();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f6579q.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = this.f6579q.get(i11);
                if (hVar.hasSubMenu()) {
                    ((e) hVar.getSubMenu()).t(list, i10, keyEvent);
                }
                char alphabeticShortcut = zK ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if ((modifiers & p1.a.f120315e) == ((zK ? hVar.getAlphabeticModifiers() : hVar.getNumericModifiers()) & p1.a.f120315e) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zK && alphabeticShortcut == '\b' && i10 == 67)) && hVar.isEnabled()) {
                        list.add(hVar);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<h> arrayListH = H();
        if (this.f6584v) {
            boolean zE = false;
            for (WeakReference<j> weakReference : this.H) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    this.H.remove(weakReference);
                } else {
                    zE |= jVar.e();
                }
            }
            if (zE) {
                this.f6582t.clear();
                this.f6583u.clear();
                int size = arrayListH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = arrayListH.get(i10);
                    if (hVar.o()) {
                        this.f6582t.add(hVar);
                    } else {
                        this.f6583u.add(hVar);
                    }
                }
            } else {
                this.f6582t.clear();
                this.f6583u.clear();
                this.f6583u.addAll(H());
            }
            this.f6584v = false;
        }
    }

    public ArrayList<h> v() {
        u();
        return this.f6582t;
    }

    public String w() {
        return N;
    }

    public Context x() {
        return this.f6574l;
    }

    public h y() {
        return this.I;
    }

    public Drawable z() {
        return this.f6588z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f6575m.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f6575m.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h hVar = (h) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f6574l, this, hVar);
        hVar.A(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f6575m.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f6575m.getString(i13));
    }

    public e G() {
        return this;
    }
}
