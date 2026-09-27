package com.cleveradssolutions.adapters.exchange.rendering.sdk.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Date f42458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42460c;

    public e(String str) {
        String strSubstring;
        String strSubstring2;
        String str2;
        if (str == null) {
            this.f42460c = true;
            return;
        }
        if (str.contains("T")) {
            strSubstring = str.substring(0, str.indexOf("T"));
            strSubstring2 = str.substring(str.indexOf("T") + 1);
            str2 = "'T'";
        } else if (str.contains(" ")) {
            strSubstring = str.substring(0, str.indexOf(" "));
            strSubstring2 = str.substring(str.indexOf(" ") + 1);
            str2 = "' '";
        } else {
            this.f42458a = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            strSubstring = null;
            strSubstring2 = null;
            str2 = null;
        }
        if (strSubstring == null || strSubstring2 == null || str2 == null) {
            return;
        }
        e(str, strSubstring2, str2);
    }

    public static SimpleDateFormat c(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            simpleDateFormat.parse(str);
            return simpleDateFormat;
        } catch (ParseException unused) {
            return null;
        }
    }

    public boolean a() {
        return this.f42460c;
    }

    public long b() {
        Date date = this.f42458a;
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    public void d(String str) {
        if (str != null && !str.startsWith("GMT")) {
            str = "GMT" + str;
        }
        this.f42459b = str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public final void e(String str, String str2, String str3) {
        String string;
        StringBuilder sb2;
        String str4 = "HH:mm'Z'";
        boolean z10 = false;
        if (c(str2, "HH:mm'Z'") != null) {
            sb2 = new StringBuilder();
        } else {
            str4 = "HH:mm:ss.S";
            if (c(str2, "HH:mm:ss.S") != null) {
                sb2 = new StringBuilder();
            } else {
                str4 = "HH:mm:ss.SS";
                if (c(str2, "HH:mm:ss.SS") == null) {
                    str4 = "HH:mm:ss.SSS";
                    if (c(str2, "HH:mm:ss.SSS") != null) {
                        sb2 = new StringBuilder();
                    } else {
                        str4 = "HH:mm:ss.SZZZ";
                        if (c(str2, "HH:mm:ss.SZZZ") != null) {
                            sb2 = new StringBuilder();
                        } else {
                            str4 = "HH:mm:ss.SSZZZ";
                            if (c(str2, "HH:mm:ss.SSZZZ") != null) {
                                sb2 = new StringBuilder();
                            } else {
                                str4 = "HH:mm:ss.SSSZZZ";
                                if (c(str2, "HH:mm:ss.SSSZZZ") != null) {
                                    sb2 = new StringBuilder();
                                } else {
                                    str4 = "HH:mm:ssZZZ";
                                    if (c(str2, "HH:mm:ssZZZ") != null) {
                                        sb2 = new StringBuilder();
                                    } else {
                                        str4 = "HH:mmZZZ";
                                        if (c(str2, "HH:mmZZZ") != null) {
                                            sb2 = new StringBuilder();
                                        } else {
                                            string = null;
                                        }
                                    }
                                }
                            }
                        }
                        sb2.append("yyyy-MM-dd");
                        sb2.append(str3);
                        z10 = true;
                        sb2.append(str4);
                        string = sb2.toString();
                    }
                    if (string != null) {
                        if (z10) {
                            d(str.substring(str.length() - 6));
                        }
                        this.f42458a = new SimpleDateFormat(string).parse(str);
                    }
                }
                sb2 = new StringBuilder();
            }
        }
        sb2.append("yyyy-MM-dd");
        sb2.append(str3);
        sb2.append(str4);
        string = sb2.toString();
        if (string != null) {
            if (z10) {
                d(str.substring(str.length() - 6));
            }
            this.f42458a = new SimpleDateFormat(string).parse(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Date date = this.f42458a;
            Date date2 = ((e) obj).f42458a;
            if (date != null) {
                return date.equals(date2);
            }
            if (date2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Date date = this.f42458a;
        if (date != null) {
            return date.hashCode();
        }
        return 0;
    }
}
