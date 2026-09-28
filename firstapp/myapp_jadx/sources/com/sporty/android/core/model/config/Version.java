package com.sporty.android.core.model.config;

import com.sportybet.plugin.realsports.data.CashOut;
import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.dy5;
import defpackage.zk1;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0007J\u0014\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\u0014\u0010\u0010\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0003H\u0096\u0080\u0004J\n\u0010\u0012\u001a\u00020\u0007H\u0096\u0080\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/config/Version;", "", "versionStr", "", "<init>", "(Ljava/lang/String;)V", "major", "", "minor", "build", "isValid", "", "toVersionCode", "equals", "other", "", "compareTo", "toString", "hashCode", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class Version implements Comparable<Version> {
    private int build;
    private int major;
    private int minor;

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        if (other == null || !isValid() || !other.isValid()) {
            return 0;
        }
        int i = this.major;
        int i2 = other.major;
        if (i != i2) {
            return i - i2;
        }
        int i3 = this.minor;
        int i4 = other.minor;
        if (i3 != i4) {
            return i3 - i4;
        }
        int i5 = this.build;
        int i6 = other.build;
        if (i5 != i6) {
            return i5 - i6;
        }
        return 0;
    }

    public boolean equals(Object other) {
        System.out.println((Object) (this + " equals " + other));
        if (other instanceof Version) {
            Version version = (Version) other;
            if (this.major == version.major && this.minor == version.minor && this.build == version.build) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.major * 31) + this.minor) * 31) + this.build;
    }

    public final boolean isValid() {
        return this.major > 0 || this.minor > 0 || this.build > 0;
    }

    public String toString() {
        return zk1.a(this.build, ")", dy5.a("Version(major=", this.major, this.minor, ", minor=", ", build="));
    }

    public final int toVersionCode() {
        return (this.minor * 1000) + (this.major * CashOut.BIG_NUMBER) + this.build;
    }

    public Version(String str) {
        if (str != null) {
            try {
                List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{OdQr.hWlRiLl}, false, 0, 6, null);
                if (listSplit$default.size() == 3) {
                    this.major = Integer.parseInt((String) listSplit$default.get(0));
                    this.minor = Integer.parseInt((String) listSplit$default.get(1));
                    this.build = Integer.parseInt((String) listSplit$default.get(2));
                }
            } catch (Exception unused) {
                this.build = 0;
                this.minor = 0;
                this.major = 0;
            }
        }
    }
}
