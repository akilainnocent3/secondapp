package defpackage;

import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.account.KycNativeCameraActivity;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fx40 {
    public static final Set<String> k = ay0.V(new String[]{".jpg", ".jpeg", ".png", ".webp", ".heic", ".heif"});
    public final RegistrationKYCWebViewActivity a;
    public final a7i b;
    public ValueCallback<Uri[]> c;
    public long d;
    public long e;
    public final ee<Unit> f;
    public final ee<qt00> g;
    public final ee<qt00> h;
    public final ee<String[]> i;
    public final ee<String[]> j;

    public fx40(RegistrationKYCWebViewActivity registrationKYCWebViewActivity, a7i a7iVar) {
        this.a = registrationKYCWebViewActivity;
        this.b = a7iVar;
        this.f = registrationKYCWebViewActivity.registerForActivityResult(KycNativeCameraActivity.i, new ud() { // from class: zw40
            @Override // defpackage.ud
            public final void a(Object obj) {
                Uri uri = (Uri) obj;
                itf0.a aVar = itf0.a;
                aVar.q("SB_REG_KYC_WEBVIEW");
                fx40 fx40Var = this.a;
                aVar.a("native camera result, elapsedSinceLaunchMs=%s, result=%s, %s", fx40.c(fx40Var.e), fx40Var.a(uri), RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) fx40Var.b.b));
                aVar.q(MyLog.TAG_FILE_PROVIDER);
                aVar.l("Registration KYC native camera result: " + uri, new Object[0]);
                fx40Var.d(uri != null ? new Uri[]{uri} : null, "native_camera_result");
            }
        });
        this.g = registrationKYCWebViewActivity.registerForActivityResult(new zd(), new ud() { // from class: ax40
            @Override // defpackage.ud
            public final void a(Object obj) {
                Uri uri = (Uri) obj;
                itf0.a aVar = itf0.a;
                aVar.q("SB_REG_KYC_WEBVIEW");
                fx40 fx40Var = this.a;
                aVar.a("pickImage result, result=%s, %s", fx40Var.a(uri), RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) fx40Var.b.b));
                aVar.q(MyLog.TAG_FILE_PROVIDER);
                aVar.l("Registration KYC pick image result: " + uri, new Object[0]);
                fx40Var.d(uri != null ? new Uri[]{uri} : null, "photo_picker_result");
            }
        });
        this.h = registrationKYCWebViewActivity.registerForActivityResult(new yd(), new ud() { // from class: bx40
            @Override // defpackage.ud
            public final void a(Object obj) {
                List list = (List) obj;
                list.getClass();
                itf0.a aVar = itf0.a;
                aVar.q("SB_REG_KYC_WEBVIEW");
                Integer numValueOf = Integer.valueOf(list.size());
                Uri[] uriArr = (Uri[]) list.toArray(new Uri[0]);
                fx40 fx40Var = this.a;
                aVar.a("pickImages result, count=%s, result=%s, %s", numValueOf, fx40Var.b(uriArr), RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) fx40Var.b.b));
                aVar.q(MyLog.TAG_FILE_PROVIDER);
                aVar.l(hce0.a(list.size(), "Registration KYC pick images result: "), new Object[0]);
                if (list.isEmpty()) {
                    list = null;
                }
                fx40Var.d(list != null ? (Uri[]) list.toArray(new Uri[0]) : null, "photo_picker_result");
            }
        });
        this.i = registrationKYCWebViewActivity.registerForActivityResult(new wd(), new ud() { // from class: cx40
            @Override // defpackage.ud
            public final void a(Object obj) {
                Uri uri = (Uri) obj;
                itf0.a aVar = itf0.a;
                aVar.q("SB_REG_KYC_WEBVIEW");
                fx40 fx40Var = this.a;
                aVar.a("openDocument result, result=%s, %s", fx40Var.a(uri), RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) fx40Var.b.b));
                aVar.q(MyLog.TAG_FILE_PROVIDER);
                aVar.l("Registration KYC open document result: " + uri, new Object[0]);
                fx40Var.d(uri != null ? new Uri[]{uri} : null, "document_picker_result");
            }
        });
        this.j = registrationKYCWebViewActivity.registerForActivityResult(new xd(), new ud() { // from class: dx40
            @Override // defpackage.ud
            public final void a(Object obj) {
                List list = (List) obj;
                list.getClass();
                itf0.a aVar = itf0.a;
                aVar.q("SB_REG_KYC_WEBVIEW");
                Integer numValueOf = Integer.valueOf(list.size());
                Uri[] uriArr = (Uri[]) list.toArray(new Uri[0]);
                fx40 fx40Var = this.a;
                aVar.a("openDocuments result, count=%s, result=%s, %s", numValueOf, fx40Var.b(uriArr), RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) fx40Var.b.b));
                aVar.q(MyLog.TAG_FILE_PROVIDER);
                aVar.l(hce0.a(list.size(), "Registration KYC open documents result: "), new Object[0]);
                if (list.isEmpty()) {
                    list = null;
                }
                fx40Var.d(list != null ? (Uri[]) list.toArray(new Uri[0]) : null, "document_picker_result");
            }
        });
    }

    public static Long c(long j) {
        Long lValueOf = Long.valueOf(j);
        if (j <= 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        return Long.valueOf(SystemClock.elapsedRealtime() - lValueOf.longValue());
    }

    public static ArrayList e(WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes = fileChooserParams != null ? fileChooserParams.getAcceptTypes() : null;
        int i = 0;
        if (acceptTypes == null) {
            acceptTypes = new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : acceptTypes) {
            str.getClass();
            p48.w(StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String lowerCase = StringsKt.t0((String) obj).toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (((String) obj2).length() > 0) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public static String g(WebChromeClient.FileChooserParams fileChooserParams) {
        String string = Arrays.toString(fileChooserParams.getAcceptTypes());
        string.getClass();
        boolean zIsCaptureEnabled = fileChooserParams.isCaptureEnabled();
        int mode = fileChooserParams.getMode();
        String filenameHint = fileChooserParams.getFilenameHint();
        StringBuilder sbA = z620.a("acceptTypes=", string, ", capture=", ", mode=", zIsCaptureEnabled);
        sbA.append(mode);
        sbA.append(", filenameHint=");
        sbA.append(filenameHint);
        return sbA.toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.content.ContentResolver] */
    public final String a(Uri uri) {
        ?? r3;
        Object bVar;
        Long l;
        String strValueOf;
        if (uri == null) {
            return "null";
        }
        RegistrationKYCWebViewActivity registrationKYCWebViewActivity = this.a;
        try {
            zi50.a aVar = zi50.b;
            String scheme = uri.getScheme();
            if (scheme != null) {
                int iHashCode = scheme.hashCode();
                r3 = 3143036;
                try {
                    if (iHashCode != 3143036) {
                        if (iHashCode == 951530617 && scheme.equals("content")) {
                            r3 = uri;
                            Cursor cursorQuery = registrationKYCWebViewActivity.getContentResolver().query(r3, new String[]{"_size"}, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    int columnIndex = cursorQuery.getColumnIndex("_size");
                                    bVar = (columnIndex < 0 || !cursorQuery.moveToFirst() || cursorQuery.isNull(columnIndex)) ? null : Long.valueOf(cursorQuery.getLong(columnIndex));
                                    cursorQuery.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        ft7.a(cursorQuery, th);
                                        throw th2;
                                    }
                                }
                            } else {
                                bVar = null;
                            }
                            if (bVar == null) {
                                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = registrationKYCWebViewActivity.getContentResolver().openAssetFileDescriptor(r3, "r");
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        r3 = r3;
                                        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                                        Long lValueOf = Long.valueOf(length);
                                        if (length < 0) {
                                            lValueOf = null;
                                        }
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                        bVar = lValueOf;
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            ft7.a(assetFileDescriptorOpenAssetFileDescriptor, th3);
                                            throw th4;
                                        }
                                    }
                                }
                            }
                        } else {
                            r3 = uri;
                        }
                        r3 = r3;
                        r3 = r3;
                        bVar = null;
                    } else {
                        r3 = uri;
                        if (scheme.equals("file")) {
                            String path = r3.getPath();
                            if (path != null) {
                                r3 = r3;
                                bVar = Long.valueOf(new File(path).length());
                            }
                        } else {
                            r3 = r3;
                        }
                        r3 = r3;
                        r3 = r3;
                        bVar = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    Throwable th6 = th;
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th6);
                    l = (Long) (bVar instanceof zi50.b ? null : bVar);
                    if (l != null) {
                        strValueOf = "unknown";
                    } else {
                        strValueOf = "unknown";
                    }
                    return kwi.a(ux5.a("uri{id=", Integer.toHexString(r3.toString().hashCode()), ", scheme=", r3.getScheme(), ", authority="), r3.getAuthority(), ", sizeBytes=", strValueOf, "}");
                }
            } else {
                r3 = uri;
                r3 = r3;
                r3 = r3;
                bVar = null;
            }
        } catch (Throwable th7) {
            th = th7;
            r3 = uri;
        }
        l = (Long) (bVar instanceof zi50.b ? null : bVar);
        if (l != null || (strValueOf = String.valueOf(l.longValue())) == null) {
            strValueOf = "unknown";
        }
        return kwi.a(ux5.a("uri{id=", Integer.toHexString(r3.toString().hashCode()), ", scheme=", r3.getScheme(), ", authority="), r3.getAuthority(), ", sizeBytes=", strValueOf, "}");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [yw40] */
    public final String b(Uri[] uriArr) {
        return uriArr != null ? ay0.G(uriArr, null, "[", "]", new Function1() { // from class: yw40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Uri uri = (Uri) obj;
                uri.getClass();
                return this.a.a(uri);
            }
        }, 25) : "null";
    }

    public final void d(Uri[] uriArr, String str) {
        boolean z = this.c != null;
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        aVar.a("finishFileChooser, reason=%s, hadCallback=%s, resultCount=%s, result=%s, elapsedSinceChooserMs=%s, elapsedSinceCameraLaunchMs=%s, %s", str, Boolean.valueOf(z), Integer.valueOf(uriArr != null ? uriArr.length : 0), b(uriArr), c(this.d), c(this.e), RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) this.b.b));
        ValueCallback<Uri[]> valueCallback = this.c;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
        }
        this.c = null;
        this.d = 0L;
        this.e = 0L;
    }

    public final void f(String str, Function0<Unit> function0) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = function0.invoke();
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q("SB_REG_KYC_WEBVIEW");
            aVar3.p(thA, "launchFileChooser failed, action=%s, %s", str, RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) this.b.b));
            aVar3.q(MyLog.TAG_FILE_PROVIDER);
            aVar3.p(thA, "Failed to launch Registration KYC file chooser", new Object[0]);
            d(null, str.concat("_launch_failed"));
        }
    }
}
