package defpackage;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xtb implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String name = ((File) obj).getName();
        int i = ytb.f;
        return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
    }
}
