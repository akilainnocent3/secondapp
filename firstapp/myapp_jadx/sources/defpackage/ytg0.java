package defpackage;

import defpackage.ytg0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ytg0<CHILD extends ytg0<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            gqm.a(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof ytg0;
    }

    public int hashCode() {
        return swx.a.hashCode();
    }
}
