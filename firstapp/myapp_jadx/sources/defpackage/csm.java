package defpackage;

import defpackage.csm;
import java.lang.Enum;

/* JADX INFO: loaded from: classes4.dex */
public interface csm<E extends Enum<E> & csm<E>> {
    /* JADX WARN: Incorrect return type in method signature: ()TE; */
    Enum getDefault();

    String getValue();
}
