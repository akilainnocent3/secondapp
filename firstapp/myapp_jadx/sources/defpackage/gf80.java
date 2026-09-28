package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class gf80 {
    public final Context a;
    public String b;
    public final HashMap c = new HashMap();

    public gf80(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        HashMap map = this.c;
        String[] strArr = (String[]) map.get("com.huawei.appmarket");
        if (strArr == null) {
            strArr = new String[]{str};
        } else {
            int length = strArr.length;
            for (String str2 : strArr) {
                if (!TextUtils.equals(str2, str)) {
                }
            }
            String[] strArr2 = new String[length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            strArr2[length] = str;
            strArr = strArr2;
        }
        map.put("com.huawei.appmarket", strArr);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0254  */
    /* JADX WARN: Code duplicated, block: B:118:0x025c  */
    /* JADX WARN: Code duplicated, block: B:125:0x026f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0275 A[LOOP:2: B:114:0x024e->B:128:0x0275, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0288 A[EDGE_INSN: B:131:0x0288->B:69:0x01a5 BREAK  A[LOOP:1: B:98:0x0214->B:102:0x0228]] */
    /* JADX WARN: Code duplicated, block: B:132:0x028e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0298 A[EDGE_INSN: B:134:0x0298->B:69:0x01a5 BREAK  A[LOOP:1: B:98:0x0214->B:102:0x0228]] */
    /* JADX WARN: Code duplicated, block: B:154:0x02de  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e8 A[EDGE_INSN: B:156:0x02e8->B:69:0x01a5 BREAK  A[LOOP:1: B:98:0x0214->B:102:0x0228]] */
    /* JADX WARN: Code duplicated, block: B:157:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x031d A[EDGE_INSN: B:162:0x031d->B:69:0x01a5 BREAK  A[LOOP:1: B:98:0x0214->B:102:0x0228]] */
    /* JADX WARN: Code duplicated, block: B:186:0x029e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:99:0x0216  */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x02ee, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.List] */
    public final boolean b() {
        String str;
        HashMap map;
        String[] strArr;
        gek0 gek0Var;
        String str2;
        String str3;
        ?? arrayList;
        ArrayList arrayList2;
        gek0 gek0Var2;
        String str4;
        ApplicationInfo applicationInfo;
        gek0 gek0Var3;
        String str5;
        X509Certificate x509CertificateA;
        PublicKey publicKey;
        int size;
        int i;
        X509Certificate x509Certificate;
        boolean zVerify;
        X509Certificate x509Certificate2;
        boolean[] keyUsage;
        boolean z;
        X509Certificate x509Certificate3;
        if (TextUtils.isEmpty(this.b)) {
            gek0.b.a("ServiceVerifyKit", "PackageName is null or empty!");
            return false;
        }
        Context context = this.a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.b, 192);
            if (packageInfo.applicationInfo == null) {
                gek0.b.a("ServiceVerifyKit", "skip package " + this.b + " for ApplicationInfo is null");
                return false;
            }
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                gek0.b.a("ServiceVerifyKit", "skip package " + this.b + " for no sign");
                return false;
            }
            byte[] byteArray = signatureArr[0].toByteArray();
            if (byteArray.length == 0) {
                gek0.b.a("ServiceVerifyKit", "skip package " + this.b + " for sign is empty");
                return false;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(byteArray);
                char[] cArr = new char[bArrDigest.length << 1];
                int i2 = 0;
                for (byte b : bArrDigest) {
                    int i3 = i2 + 1;
                    char[] cArr2 = fek0.a;
                    cArr[i2] = cArr2[(b & 240) >>> 4];
                    i2 += 2;
                    cArr[i3] = cArr2[b & 15];
                }
                String str6 = new String(cArr);
                Bundle bundle = packageInfo.applicationInfo.metaData;
                if (bundle == null) {
                    gek0.b.a("ServiceVerifyKit", "package" + this.b + " metadata is null!");
                    return false;
                }
                new HashMap();
                new HashMap();
                new HashMap();
                new ArrayList();
                new ArrayList();
                new HashMap().put("com.huawei.appgallery.fingerprint_signature", "com.huawei.appgallery.sign_certchain");
                String str7 = this.b;
                if (!bundle.containsKey("com.huawei.appgallery.fingerprint_signature") || !bundle.containsKey("com.huawei.appgallery.sign_certchain")) {
                    gek0.b.a("MatchAppFinder", "checkSinger failed, packageName is " + str7);
                    str = this.b;
                    map = this.c;
                    if (!map.containsKey(str) && (strArr = (String[]) map.get(str)) != null) {
                        for (String str8 : strArr) {
                            if (!str6.equals(str8)) {
                            }
                        }
                        return false;
                    }
                }
                if (bundle.containsKey("com.huawei.appgallery.fingerprint_signature") && bundle.containsKey("com.huawei.appgallery.sign_certchain")) {
                    byte[] bytes = null;
                    String strA = TextUtils.isEmpty(null) ? oxc.a(str7, "&", str6) : lx5.a("null&", str7, "&", str6);
                    String string = bundle.getString("com.huawei.appgallery.fingerprint_signature");
                    String string2 = bundle.getString("com.huawei.appgallery.sign_certchain");
                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                        gek0Var = gek0.b;
                        str3 = "args is invalid";
                    } else {
                        try {
                            JSONArray jSONArray = new JSONArray(string2);
                            if (jSONArray.length() <= 1) {
                                arrayList = Collections.EMPTY_LIST;
                            } else {
                                arrayList = new ArrayList(jSONArray.length());
                                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                    arrayList.add(jSONArray.getString(i4));
                                }
                            }
                        } catch (JSONException unused) {
                            gek0.b.a("X509CertUtil", "Failed to getCertChain: ");
                            arrayList = Collections.EMPTY_LIST;
                        }
                        if (arrayList == 0) {
                            gek0.b.c("base64 CertChain is null.");
                            arrayList2 = new ArrayList();
                        } else {
                            ArrayList arrayList3 = new ArrayList(arrayList.size());
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                X509Certificate x509CertificateA2 = kek0.a((String) it.next());
                                if (x509CertificateA2 == null) {
                                    gek0.b.a("X509CertUtil", "Failed to get cert from CertChain");
                                } else {
                                    arrayList3.add(x509CertificateA2);
                                }
                            }
                            arrayList2 = arrayList3;
                        }
                        if (arrayList2.size() != 0) {
                            try {
                                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                            } catch (PackageManager.NameNotFoundException e) {
                                e = e;
                                gek0Var2 = gek0.b;
                                str4 = "PackageInfo with NameNotFoundException:";
                                gek0Var2.b("X509CertUtil", str4, e);
                                applicationInfo = null;
                            } catch (Exception e2) {
                                e = e2;
                                gek0Var2 = gek0.b;
                                str4 = "PackageInfo with Exception:";
                                gek0Var2.b("X509CertUtil", str4, e);
                                applicationInfo = null;
                            }
                            if (applicationInfo != null) {
                                Bundle bundle2 = applicationInfo.metaData;
                                if (bundle2 != null) {
                                    String string3 = bundle2.getString("componentverify_ag_cbg_root");
                                    if (TextUtils.isEmpty(string3)) {
                                        gek0Var3 = gek0.b;
                                        str5 = "failed getCBGRootCA sdkCbgRoot is null";
                                    } else {
                                        x509CertificateA = kek0.a(string3);
                                    }
                                    if (arrayList2.size() != 0) {
                                        gek0Var = gek0.b;
                                        str3 = "failed to verify cert chain";
                                        break;
                                    }
                                    if (x509CertificateA == null) {
                                        gek0.b.a("X509CertUtil", "rootCert is null,verify failed ");
                                    } else {
                                        try {
                                            x509CertificateA.checkValidity();
                                            publicKey = x509CertificateA.getPublicKey();
                                            size = arrayList2.size() - 1;
                                            while (true) {
                                                if (size < 0) {
                                                    i = 1;
                                                    while (true) {
                                                        if (i < arrayList2.size()) {
                                                            x509Certificate2 = (X509Certificate) arrayList2.get(i);
                                                            if (x509Certificate2 == null && x509Certificate2.getBasicConstraints() != -1) {
                                                                keyUsage = x509Certificate2.getKeyUsage();
                                                                if (keyUsage.length <= 5) {
                                                                    z = false;
                                                                } else {
                                                                    z = keyUsage[5];
                                                                }
                                                            } else {
                                                                z = false;
                                                            }
                                                            if (!z) {
                                                                i++;
                                                            }
                                                        } else {
                                                            x509Certificate = (X509Certificate) arrayList2.get(0);
                                                            if (!kek0.b(x509Certificate, "CN", "AppGallery Verification")) {
                                                                gek0Var = gek0.b;
                                                                str3 = "CN is invalid";
                                                                break;
                                                            }
                                                            if (!kek0.b(x509Certificate, "OU", "Huawei CBG Cloud Security Signer")) {
                                                                gek0Var = gek0.b;
                                                                str3 = "OU is invalid";
                                                                break;
                                                            }
                                                            try {
                                                                bytes = strA.getBytes("UTF-8");
                                                            } catch (UnsupportedEncodingException e3) {
                                                                gek0.b.b("MatchAppFinder", "checkCertChain UnsupportedEncodingException:", e3);
                                                            }
                                                            byte[] bArrA = idk0.a(string);
                                                            if (x509Certificate != null || bytes == null || bArrA.length == 0) {
                                                                gek0.b.c("checkSignature parameter is null");
                                                            } else {
                                                                try {
                                                                    java.security.Signature signature = java.security.Signature.getInstance(x509Certificate.getSigAlgName());
                                                                    signature.initVerify(x509Certificate.getPublicKey());
                                                                    signature.update(bytes);
                                                                    zVerify = signature.verify(bArrA);
                                                                } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e4) {
                                                                    gek0.b.b("X509CertUtil", "failed checkSignature,Exception:", e4);
                                                                    zVerify = false;
                                                                }
                                                                if (!zVerify) {
                                                                    gek0Var = gek0.b;
                                                                    str3 = "signature is invalid";
                                                                    break;
                                                                }
                                                                gek0.b.a("MatchAppFinder", "checkSinger success, packageName is " + str7);
                                                            }
                                                            zVerify = false;
                                                            if (!zVerify) {
                                                                gek0Var = gek0.b;
                                                                str3 = "signature is invalid";
                                                                break;
                                                            }
                                                            gek0.b.a("MatchAppFinder", "checkSinger success, packageName is " + str7);
                                                        }
                                                    }
                                                } else {
                                                    x509Certificate3 = (X509Certificate) arrayList2.get(size);
                                                    if (x509Certificate3 != null) {
                                                        try {
                                                            x509Certificate3.verify(publicKey);
                                                            x509Certificate3.checkValidity();
                                                            publicKey = x509Certificate3.getPublicKey();
                                                            size--;
                                                        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e5) {
                                                            gek0.b.a("X509CertUtil", "verify failed " + e5.getMessage());
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (CertificateExpiredException | CertificateNotYetValidException e6) {
                                            gek0.b.a("X509CertUtil", "verifyCertChain Exception:" + e6.getMessage());
                                        }
                                    }
                                    gek0Var = gek0.b;
                                    str3 = "failed to verify cert chain";
                                    break;
                                } else {
                                    gek0Var3 = gek0.b;
                                    str5 = "failed getCBGRootCA metaData is null";
                                }
                            } else {
                                gek0Var3 = gek0.b;
                                str5 = "failed getCBGRootCA packageInfo is null";
                            }
                            gek0Var3.a("X509CertUtil", str5);
                            x509CertificateA = null;
                            if (arrayList2.size() != 0) {
                                gek0Var = gek0.b;
                                str3 = "failed to verify cert chain";
                                break;
                            }
                            if (x509CertificateA == null) {
                                gek0.b.a("X509CertUtil", "rootCert is null,verify failed ");
                            } else {
                                x509CertificateA.checkValidity();
                                publicKey = x509CertificateA.getPublicKey();
                                size = arrayList2.size() - 1;
                                while (true) {
                                    if (size < 0) {
                                        i = 1;
                                        while (true) {
                                            if (i < arrayList2.size()) {
                                                x509Certificate2 = (X509Certificate) arrayList2.get(i);
                                                if (x509Certificate2 == null) {
                                                    z = false;
                                                } else {
                                                    keyUsage = x509Certificate2.getKeyUsage();
                                                    if (keyUsage.length <= 5) {
                                                        z = false;
                                                    } else {
                                                        z = keyUsage[5];
                                                    }
                                                }
                                                if (!z) {
                                                    i++;
                                                }
                                            } else {
                                                x509Certificate = (X509Certificate) arrayList2.get(0);
                                                if (!kek0.b(x509Certificate, "CN", "AppGallery Verification")) {
                                                    gek0Var = gek0.b;
                                                    str3 = "CN is invalid";
                                                    break;
                                                }
                                                if (!kek0.b(x509Certificate, "OU", "Huawei CBG Cloud Security Signer")) {
                                                    gek0Var = gek0.b;
                                                    str3 = "OU is invalid";
                                                    break;
                                                }
                                                bytes = strA.getBytes("UTF-8");
                                                byte[] bArrA2 = idk0.a(string);
                                                if (x509Certificate != null) {
                                                    gek0.b.c("checkSignature parameter is null");
                                                    zVerify = false;
                                                } else {
                                                    gek0.b.c("checkSignature parameter is null");
                                                    zVerify = false;
                                                }
                                                if (!zVerify) {
                                                    gek0Var = gek0.b;
                                                    str3 = "signature is invalid";
                                                    break;
                                                }
                                                gek0.b.a("MatchAppFinder", "checkSinger success, packageName is " + str7);
                                            }
                                        }
                                    } else {
                                        x509Certificate3 = (X509Certificate) arrayList2.get(size);
                                        if (x509Certificate3 != null) {
                                            x509Certificate3.verify(publicKey);
                                            x509Certificate3.checkValidity();
                                            publicKey = x509Certificate3.getPublicKey();
                                            size--;
                                        }
                                    }
                                }
                            }
                            gek0Var = gek0.b;
                            str3 = "failed to verify cert chain";
                            break;
                        } else {
                            gek0Var = gek0.b;
                            str3 = "certChain is empty";
                        }
                    }
                    gek0Var.a("MatchAppFinder", str3);
                    str2 = "checkSinger failed";
                } else {
                    gek0Var = gek0.b;
                    str2 = "skip package " + str7 + " for no signer or no certChain";
                }
                gek0Var.a("MatchAppFinder", str2);
                gek0.b.a("MatchAppFinder", "checkSinger failed, packageName is " + str7);
                str = this.b;
                map = this.c;
                return !map.containsKey(str) ? false : false;
                return true;
            } catch (NoSuchAlgorithmException unused2) {
                gek0.b.a("ServiceVerifyKit", "skip package " + this.b + " for AlgorithmException");
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            gek0.b.a("ServiceVerifyKit", "get packageInfo from " + this.b + " with NameNotFoundException");
            return false;
        } catch (Exception unused4) {
            gek0.b.a("ServiceVerifyKit", "get packageInfo from " + this.b + " with exception");
            return false;
        }
    }
}
