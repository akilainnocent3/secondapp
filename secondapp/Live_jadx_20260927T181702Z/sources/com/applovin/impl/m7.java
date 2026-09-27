package com.applovin.impl;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Intent f27559a = new Intent();

    public m7 a(String str, String str2) {
        boolean zIsValidString = StringUtils.isValidString(str);
        boolean zIsValidString2 = StringUtils.isValidString(str2);
        if (zIsValidString && zIsValidString2) {
            this.f27559a.setDataAndType(Uri.parse(str), str2);
            return this;
        }
        if (zIsValidString) {
            this.f27559a.setData(Uri.parse(str));
            return this;
        }
        if (zIsValidString2) {
            this.f27559a.setType(str2);
        }
        return this;
    }

    public m7 b(String str) {
        if (StringUtils.isValidString(str)) {
            this.f27559a.addFlags(Integer.parseInt(str));
        }
        return this;
    }

    public Intent c(String str) {
        Intent intentCreateChooser = Intent.createChooser(this.f27559a, StringUtils.emptyIfNull(str));
        intentCreateChooser.addFlags(this.f27559a.getFlags());
        return intentCreateChooser;
    }

    public m7 d(String str) {
        if (StringUtils.isValidString(str)) {
            this.f27559a.setAction(str);
        }
        return this;
    }

    public m7 e(String str) {
        if (StringUtils.isValidString(str)) {
            this.f27559a.putExtras(JsonUtils.toBundle(JsonUtils.jsonObjectFromJsonString(str, new JSONObject())));
        }
        return this;
    }

    public m7 f(String str) {
        if (StringUtils.isValidString(str) && p0.g()) {
            this.f27559a.setIdentifier(str);
        }
        return this;
    }

    public m7 g(String str) {
        if (StringUtils.isValidString(str)) {
            this.f27559a.setSelector(new Intent(str));
        }
        return this;
    }

    public m7 h(String str) {
        if (StringUtils.isValidString(str)) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length == 4) {
                this.f27559a.setSourceBounds(new Rect(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Integer.parseInt(strArrSplit[3])));
            }
        }
        return this;
    }

    public m7 b(String str, String str2, String str3) {
        if (StringUtils.isValidString(str)) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString != null) {
                this.f27559a.setComponent(componentNameUnflattenFromString);
                return this;
            }
        } else {
            if (StringUtils.isValidString(str2) && StringUtils.isValidString(str3)) {
                this.f27559a.setClassName(str3, str2);
                return this;
            }
            if (StringUtils.isValidString(str3)) {
                this.f27559a.setPackage(str3);
            }
        }
        return this;
    }

    public m7 a(String str) {
        if (StringUtils.isValidString(str)) {
            for (String str2 : str.split(",")) {
                this.f27559a.addCategory(str2);
            }
        }
        return this;
    }

    public m7 a(String str, String str2, String str3) {
        ClipData clipDataNewRawUri;
        if (StringUtils.isValidString(str)) {
            Uri uri = Uri.parse(str);
            if (StringUtils.isValidString(str2)) {
                clipDataNewRawUri = new ClipData(new ClipDescription(StringUtils.emptyIfNull(str3), new String[]{str2}), new ClipData.Item(uri));
            } else {
                clipDataNewRawUri = ClipData.newRawUri(StringUtils.emptyIfNull(str3), uri);
            }
            this.f27559a.setClipData(clipDataNewRawUri);
        }
        return this;
    }

    public Intent a() {
        return this.f27559a;
    }
}
