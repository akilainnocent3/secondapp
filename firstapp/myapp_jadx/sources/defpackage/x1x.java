package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x1x implements bfx {
    public final String a;
    public final MyFavoriteTypeEnum b;

    public x1x(MyFavoriteTypeEnum myFavoriteTypeEnum, String str) {
        myFavoriteTypeEnum.getClass();
        this.a = str;
        this.b = myFavoriteTypeEnum;
    }

    public static final x1x fromBundle(Bundle bundle) {
        String string;
        MyFavoriteTypeEnum myFavoriteTypeEnum;
        bundle.getClass();
        bundle.setClassLoader(x1x.class.getClassLoader());
        if (bundle.containsKey("finish")) {
            string = bundle.getString("finish");
            if (string == null) {
                hb5.a("Argument \"finish\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "Finish";
        }
        if (!bundle.containsKey("type")) {
            myFavoriteTypeEnum = MyFavoriteTypeEnum.NONE;
        } else {
            if (!Parcelable.class.isAssignableFrom(MyFavoriteTypeEnum.class) && !Serializable.class.isAssignableFrom(MyFavoriteTypeEnum.class)) {
                zkh.a(MyFavoriteTypeEnum.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            myFavoriteTypeEnum = (MyFavoriteTypeEnum) bundle.get("type");
            if (myFavoriteTypeEnum == null) {
                hb5.a("Argument \"type\" is marked as non-null but was passed a null value.");
                return null;
            }
        }
        return new x1x(myFavoriteTypeEnum, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1x)) {
            return false;
        }
        x1x x1xVar = (x1x) obj;
        return Intrinsics.g(this.a, x1xVar.a) && this.b == x1xVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MyStakeFragmentArgs(finish=" + this.a + ", type=" + this.b + ")";
    }

    public x1x() {
        this(MyFavoriteTypeEnum.NONE, "Finish");
    }
}
