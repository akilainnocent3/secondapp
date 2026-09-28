package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lid;", "Lvkx;", "Lid$a;", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@vkx.a("activity")
public class id extends vkx<a> {
    public final Context c;
    public final Activity d;

    public static class a extends ygx {
        public Intent i;
        public String v;

        public a() {
            throw null;
        }

        public static String n(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            packageName.getClass();
            return c.p(str, "${applicationId}", packageName, false);
        }

        @Override // defpackage.ygx
        public final boolean equals(Object obj) {
            boolean zFilterEquals;
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof a) && super.equals(obj)) {
                Intent intent = this.i;
                if (intent != null) {
                    zFilterEquals = intent.filterEquals(((a) obj).i);
                } else {
                    zFilterEquals = ((a) obj).i == null;
                }
                if (zFilterEquals && Intrinsics.g(this.v, ((a) obj).v)) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ygx
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.i;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.v;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // defpackage.ygx
        public final void k(Context context, AttributeSet attributeSet) {
            context.getClass();
            super.k(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, ak30.a);
            typedArrayObtainAttributes.getClass();
            String strN = n(context, typedArrayObtainAttributes.getString(4));
            Intent intent = this.i;
            if (intent == null) {
                intent = new Intent();
                this.i = intent;
            }
            intent.setPackage(strN);
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                ComponentName componentName = new ComponentName(context, string);
                Intent intent2 = this.i;
                if (intent2 == null) {
                    intent2 = new Intent();
                    this.i = intent2;
                }
                intent2.setComponent(componentName);
            }
            String string2 = typedArrayObtainAttributes.getString(1);
            Intent intent3 = this.i;
            if (intent3 == null) {
                intent3 = new Intent();
                this.i = intent3;
            }
            intent3.setAction(string2);
            String strN2 = n(context, typedArrayObtainAttributes.getString(2));
            if (strN2 != null) {
                Uri uri = Uri.parse(strN2);
                Intent intent4 = this.i;
                if (intent4 == null) {
                    intent4 = new Intent();
                    this.i = intent4;
                }
                intent4.setData(uri);
            }
            this.v = n(context, typedArrayObtainAttributes.getString(3));
            typedArrayObtainAttributes.recycle();
        }

        @Override // defpackage.ygx
        public final String toString() {
            Intent intent = this.i;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb = new StringBuilder(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.i;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            return sb.toString();
        }
    }

    public id(Context context) {
        context.getClass();
        this.c = context;
        for (Object obj : fd80.c(context, new hd(0))) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
            }
        }
        obj = null;
        this.d = (Activity) obj;
    }

    @Override // defpackage.vkx
    public final ygx a() {
        return new a(this);
    }

    @Override // defpackage.vkx
    public final ygx c(ygx ygxVar, Bundle bundle, zix zixVar) {
        Intent intent;
        int intExtra;
        a aVar = (a) ygxVar;
        Intent intent2 = aVar.i;
        dhx dhxVar = aVar.b;
        if (intent2 == null) {
            q1b.a(zk1.a(dhxVar.e, " does not have an Intent set.", new StringBuilder("Destination ")));
            return null;
        }
        Intent intent3 = new Intent(aVar.i);
        if (bundle != null) {
            intent3.putExtras(bundle);
            String str = aVar.v;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    if (!bundle.containsKey(strGroup)) {
                        vgx.a(strGroup, "Could not find ", " in ", bundle, " to fill data pattern ", str);
                        return null;
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    ffx ffxVar = aVar.f().get(strGroup);
                    djx<Object> djxVar = ffxVar != null ? ffxVar.a : null;
                    stringBuffer.append(djxVar != null ? djxVar.f(djxVar.a(strGroup, bundle)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent3.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.d;
        if (activity == null) {
            intent3.addFlags(268435456);
        }
        if (zixVar != null && zixVar.a) {
            intent3.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent3.putExtra("android-support-navigation:ActivityNavigator:current", dhxVar.e);
        Context context = this.c;
        Resources resources = context.getResources();
        if (zixVar != null) {
            int i = zixVar.h;
            int i2 = zixVar.i;
            if ((i <= 0 || !Intrinsics.g(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !Intrinsics.g(resources.getResourceTypeName(i2), "animator"))) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2).getClass();
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + aVar);
            }
        }
        context.startActivity(intent3);
        if (zixVar != null && activity != null) {
            int i3 = zixVar.f;
            int i4 = zixVar.g;
            if ((i3 > 0 && Intrinsics.g(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && Intrinsics.g(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + aVar);
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // defpackage.vkx
    public final boolean j() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
