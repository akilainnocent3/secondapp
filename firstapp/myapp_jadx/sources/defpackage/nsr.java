package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.t;

/* JADX INFO: loaded from: classes.dex */
public interface nsr extends d.b {
    default int C(xkt xktVar, mzo mzoVar, int i) {
        return e(new h(xktVar, xktVar.getLayoutDirection()), new oiv(mzoVar, qiv.b, riv.a), oxa.b(0, 0, i, 7)).c();
    }

    biv e(t tVar, vhv vhvVar, long j);

    default int o(xkt xktVar, mzo mzoVar, int i) {
        return e(new h(xktVar, xktVar.getLayoutDirection()), new oiv(mzoVar, qiv.a, riv.a), oxa.b(0, 0, i, 7)).c();
    }

    default int s(xkt xktVar, mzo mzoVar, int i) {
        return e(new h(xktVar, xktVar.getLayoutDirection()), new oiv(mzoVar, qiv.b, riv.b), oxa.b(0, i, 0, 13)).b();
    }

    default int w(xkt xktVar, mzo mzoVar, int i) {
        return e(new h(xktVar, xktVar.getLayoutDirection()), new oiv(mzoVar, qiv.a, riv.b), oxa.b(0, i, 0, 13)).b();
    }
}
