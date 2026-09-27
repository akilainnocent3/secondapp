package com.unity3d.ads;

import dr.h1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@er.e(er.a.BINARY)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@h1(level = h1.a.ERROR, message = "This Unity Ads API is experimental. It may be changed in the future without notice.")
@Retention(RetentionPolicy.CLASS)
@er.f(allowedTargets = {er.b.CLASS, er.b.FUNCTION, er.b.PROPERTY, er.b.CONSTRUCTOR})
public @interface UnityAdsExperimental {
}
