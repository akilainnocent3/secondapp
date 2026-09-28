package androidx.fragment.app;

import android.util.Log;
import defpackage.cgt;
import defpackage.cs1;
import defpackage.ds1;
import defpackage.hyi;
import defpackage.ib5;
import defpackage.pr0;
import defpackage.s9s;
import defpackage.vvi;
import defpackage.z9l;
import defpackage.zqh0;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements FragmentManager.o {
    public final FragmentManager t;
    public boolean u;
    public int v;
    public boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(a aVar) {
        g gVarO = aVar.t.O();
        vvi<?> vviVar = aVar.t.x;
        super(gVarO, vviVar != null ? vviVar.b.getClassLoader() : null);
        ArrayList<n.a> arrayList = aVar.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            n.a aVar2 = arrayList.get(i);
            i++;
            n.a aVar3 = aVar2;
            ArrayList<n.a> arrayList2 = this.c;
            n.a aVar4 = new n.a();
            aVar4.a = aVar3.a;
            aVar4.b = aVar3.b;
            aVar4.c = aVar3.c;
            aVar4.d = aVar3.d;
            aVar4.e = aVar3.e;
            aVar4.f = aVar3.f;
            aVar4.g = aVar3.g;
            aVar4.h = aVar3.h;
            aVar4.i = aVar3.i;
            arrayList2.add(aVar4);
        }
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.n = aVar.n;
        this.o = aVar.o;
        this.l = aVar.l;
        this.m = aVar.m;
        if (aVar.p != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.p = arrayList3;
            arrayList3.addAll(aVar.p);
        }
        if (aVar.q != null) {
            ArrayList<String> arrayList4 = new ArrayList<>();
            this.q = arrayList4;
            arrayList4.addAll(aVar.q);
        }
        this.r = aVar.r;
        this.v = -1;
        this.w = false;
        this.t = aVar.t;
        this.u = aVar.u;
        this.v = aVar.v;
        this.w = aVar.w;
    }

    @Override // androidx.fragment.app.FragmentManager.o
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.R(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.n
    public final int d() {
        return k(false, true);
    }

    @Override // androidx.fragment.app.n
    public final void e(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            hyi.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            ds1.a(cls.getCanonicalName(), "Fragment ", " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                ib5.a(pr0.a(sb, fragment.mTag, " now ", str));
                return;
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        b(new n.a(fragment, i2));
        fragment.mFragmentManager = this.t;
    }

    public final void i(int i) {
        if (this.i) {
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList<n.a> arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a aVar = arrayList.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void j() {
        ArrayList<n.a> arrayList = this.c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            n.a aVar = arrayList.get(size);
            if (aVar.c) {
                if (aVar.a == 8) {
                    aVar.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = aVar.b.mContainerId;
                    aVar.a = 2;
                    aVar.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        n.a aVar2 = arrayList.get(i2);
                        if (aVar2.c && aVar2.b.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int k(boolean z, boolean z2) {
        if (this.u) {
            ib5.a("commit already called");
            return 0;
        }
        if (FragmentManager.R(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new cgt());
            n("  ", printWriter, true);
            printWriter.close();
        }
        this.u = true;
        boolean z3 = this.i;
        FragmentManager fragmentManager = this.t;
        if (z3) {
            this.v = fragmentManager.k.getAndIncrement();
        } else {
            this.v = -1;
        }
        if (z2) {
            fragmentManager.A(this, z);
        }
        return this.v;
    }

    public final void l() {
        if (this.i) {
            ib5.a("This transaction is already being added to the back stack");
        } else {
            this.j = false;
            this.t.D(this, false);
        }
    }

    public final a m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            b(new n.a(fragment, 6));
            return this;
        }
        cs1.a(fragment, "Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final void n(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        ArrayList<n.a> arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n.a aVar = arrayList.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.d != 0 || aVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.e));
                }
                if (aVar.f != 0 || aVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.g));
                }
            }
        }
    }

    public final a o(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            b(new n.a(fragment, 4));
            return this;
        }
        cs1.a(fragment, "Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final a p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            b(new n.a(fragment, 3));
            return this;
        }
        cs1.a(fragment, "Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final a q(Fragment fragment, s9s.b bVar) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.t;
        if (fragmentManager != fragmentManager2) {
            z9l.a(fragmentManager2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return null;
        }
        if (bVar == s9s.b.b && fragment.mState > -1) {
            zqh0.a(bVar, "Cannot set maximum Lifecycle to ", " after the Fragment has been created");
            return null;
        }
        if (bVar == s9s.b.a) {
            zqh0.a(bVar, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            return null;
        }
        n.a aVar = new n.a();
        aVar.a = 10;
        aVar.b = fragment;
        aVar.c = false;
        aVar.h = fragment.mMaxState;
        aVar.i = bVar;
        b(aVar);
        return this;
    }

    public final a r(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            b(new n.a(fragment, 8));
            return this;
        }
        cs1.a(fragment, "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final a s(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            b(new n.a(fragment, 5));
            return this;
        }
        cs1.a(fragment, "Cannot show Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(FragmentManager fragmentManager) {
        g gVarO = fragmentManager.O();
        vvi<?> vviVar = fragmentManager.x;
        super(gVarO, vviVar != null ? vviVar.b.getClassLoader() : null);
        this.v = -1;
        this.w = false;
        this.t = fragmentManager;
    }
}
