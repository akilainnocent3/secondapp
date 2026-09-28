package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vyw implements bfx {
    public final String a;
    public final MyFavoriteTypeEnum b;

    public vyw(MyFavoriteTypeEnum myFavoriteTypeEnum, String str) {
        myFavoriteTypeEnum.getClass();
        this.a = str;
        this.b = myFavoriteTypeEnum;
    }

    public static final vyw fromBundle(Bundle bundle) {
        String string;
        MyFavoriteTypeEnum myFavoriteTypeEnum;
        bundle.getClass();
        bundle.setClassLoader(vyw.class.getClassLoader());
        if (bundle.containsKey("next")) {
            string = bundle.getString("next");
            if (string == null) {
                hb5.a("Argument \"next\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "Next";
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
        return new vyw(myFavoriteTypeEnum, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyw)) {
            return false;
        }
        vyw vywVar = (vyw) obj;
        return Intrinsics.g(this.a, vywVar.a) && this.b == vywVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MyFavoriteTabBaseFragmentArgs(next=" + this.a + ", type=" + this.b + ")";
    }

    public vyw() {
        this(MyFavoriteTypeEnum.NONE, "Next");
    }
}
