package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pcd0 implements bfx {
    public final String a;

    public pcd0() {
        this.a = "no_tag";
    }

    public static final pcd0 fromBundle(Bundle bundle) {
        String string;
        bundle.getClass();
        bundle.setClassLoader(pcd0.class.getClassLoader());
        if (bundle.containsKey("tagId")) {
            string = bundle.getString("tagId");
            if (string == null) {
                hb5.a("Argument \"tagId\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "no_tag";
        }
        return new pcd0(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcd0) && Intrinsics.g(this.a, ((pcd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SportyTagNewsFragmentArgs(tagId=", this.a, ")");
    }

    public pcd0(String str) {
        this.a = str;
    }
}
