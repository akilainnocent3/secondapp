package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class qwk0 extends Fragment implements dbs {
    public static final WeakHashMap b = new WeakHashMap();
    public final avk0 a = new avk0();

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.a.a.values().iterator();
        while (it.hasNext()) {
            ((x9s) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.dbs
    public final void l(String str, x9s x9sVar) {
        this.a.a(str, x9sVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.a.a.values().iterator();
        while (it.hasNext()) {
            ((x9s) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        avk0 avk0Var = this.a;
        avk0Var.b = 5;
        Iterator it = avk0Var.a.values().iterator();
        while (it.hasNext()) {
            ((x9s) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        avk0 avk0Var = this.a;
        avk0Var.b = 3;
        Iterator it = avk0Var.a.values().iterator();
        while (it.hasNext()) {
            ((x9s) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        avk0 avk0Var = this.a;
        avk0Var.b = 2;
        Iterator it = avk0Var.a.values().iterator();
        while (it.hasNext()) {
            ((x9s) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        avk0 avk0Var = this.a;
        avk0Var.b = 4;
        Iterator it = avk0Var.a.values().iterator();
        while (it.hasNext()) {
            ((x9s) it.next()).onStop();
        }
    }

    @Override // defpackage.dbs
    public final x9s q(Class cls, String str) {
        return (x9s) cls.cast(this.a.a.get(str));
    }
}
