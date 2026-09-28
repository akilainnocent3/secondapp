package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class nfy {
    public static final <T extends d.c & mfy> void a(T t, Function0<Unit> function0) {
        ofy ofyVar = t.i;
        if (ofyVar == null) {
            ofyVar = new ofy(t);
            t.i = ofyVar;
        }
        pkd.g(t).getSnapshotObserver().a(ofyVar, ofy.b, function0);
    }
}
