package com.yandex.div.core.resources;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import dr.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import k.t0;
import org.xmlpull.v1.XmlPullParserException;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ResourcesWrapper extends Resources {

    @l
    private final Resources resources;

    public ResourcesWrapper(@l Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.resources = resources;
    }

    @Override // android.content.res.Resources
    @t0(30)
    public void addLoaders(@l ResourcesLoader... resourcesLoaderArr) {
        this.resources.addLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    @l
    public XmlResourceParser getAnimation(int i10) throws Resources.NotFoundException {
        return this.resources.getAnimation(i10);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i10) throws Resources.NotFoundException {
        return this.resources.getBoolean(i10);
    }

    @Override // android.content.res.Resources
    @o(message = "Deprecated in Java")
    public int getColor(int i10) throws Resources.NotFoundException {
        return this.resources.getColor(i10);
    }

    @Override // android.content.res.Resources
    @t0(23)
    @l
    public ColorStateList getColorStateList(int i10, @m Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColorStateList(i10, theme);
    }

    @Override // android.content.res.Resources
    @m
    public Configuration getConfiguration() {
        return this.resources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i10) throws Resources.NotFoundException {
        return this.resources.getDimension(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i10) throws Resources.NotFoundException {
        return this.resources.getDimensionPixelOffset(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i10) throws Resources.NotFoundException {
        return this.resources.getDimensionPixelSize(i10);
    }

    @Override // android.content.res.Resources
    @m
    public DisplayMetrics getDisplayMetrics() {
        return this.resources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    @m
    public Drawable getDrawable(int i10, @m Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getDrawable(i10, theme);
    }

    @Override // android.content.res.Resources
    @o(message = "Deprecated in Java")
    @m
    public Drawable getDrawableForDensity(int i10, int i11) throws Resources.NotFoundException {
        return this.resources.getDrawableForDensity(i10, i11);
    }

    @Override // android.content.res.Resources
    @t0(29)
    public float getFloat(int i10) throws Resources.NotFoundException {
        return this.resources.getFloat(i10);
    }

    @Override // android.content.res.Resources
    @t0(26)
    @l
    public Typeface getFont(int i10) throws Resources.NotFoundException {
        return this.resources.getFont(i10);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i10, int i11, int i12) throws Resources.NotFoundException {
        return this.resources.getFraction(i10, i11, i12);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(@m String str, @m String str2, @m String str3) {
        return this.resources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    @l
    public int[] getIntArray(int i10) throws Resources.NotFoundException {
        return this.resources.getIntArray(i10);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i10) throws Resources.NotFoundException {
        return this.resources.getInteger(i10);
    }

    @Override // android.content.res.Resources
    @l
    public XmlResourceParser getLayout(int i10) throws Resources.NotFoundException {
        return this.resources.getLayout(i10);
    }

    @Override // android.content.res.Resources
    @o(message = "Deprecated in Java")
    @m
    public Movie getMovie(int i10) throws Resources.NotFoundException {
        return this.resources.getMovie(i10);
    }

    @Override // android.content.res.Resources
    @l
    public String getQuantityString(int i10, int i11, @l Object... objArr) throws Resources.NotFoundException {
        return this.resources.getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // android.content.res.Resources
    @l
    public CharSequence getQuantityText(int i10, int i11) throws Resources.NotFoundException {
        return this.resources.getQuantityText(i10, i11);
    }

    @Override // android.content.res.Resources
    @m
    public String getResourceEntryName(int i10) throws Resources.NotFoundException {
        return this.resources.getResourceEntryName(i10);
    }

    @Override // android.content.res.Resources
    @m
    public String getResourceName(int i10) throws Resources.NotFoundException {
        return this.resources.getResourceName(i10);
    }

    @Override // android.content.res.Resources
    @m
    public String getResourcePackageName(int i10) throws Resources.NotFoundException {
        return this.resources.getResourcePackageName(i10);
    }

    @Override // android.content.res.Resources
    @m
    public String getResourceTypeName(int i10) throws Resources.NotFoundException {
        return this.resources.getResourceTypeName(i10);
    }

    @Override // android.content.res.Resources
    @l
    public String getString(int i10, @l Object... objArr) throws Resources.NotFoundException {
        return this.resources.getString(i10, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // android.content.res.Resources
    @l
    public String[] getStringArray(int i10) throws Resources.NotFoundException {
        return this.resources.getStringArray(i10);
    }

    @Override // android.content.res.Resources
    @m
    public CharSequence getText(int i10, @m CharSequence charSequence) {
        return this.resources.getText(i10, charSequence);
    }

    @Override // android.content.res.Resources
    @l
    public CharSequence[] getTextArray(int i10) throws Resources.NotFoundException {
        return this.resources.getTextArray(i10);
    }

    @Override // android.content.res.Resources
    public void getValue(@m String str, @m TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.resources.getValue(str, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i10, int i11, @m TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.resources.getValueForDensity(i10, i11, typedValue, z10);
    }

    @Override // android.content.res.Resources
    @l
    public XmlResourceParser getXml(int i10) throws Resources.NotFoundException {
        return this.resources.getXml(i10);
    }

    @Override // android.content.res.Resources
    @m
    public TypedArray obtainAttributes(@m AttributeSet attributeSet, @m int[] iArr) {
        return this.resources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    @l
    public TypedArray obtainTypedArray(int i10) throws Resources.NotFoundException {
        return this.resources.obtainTypedArray(i10);
    }

    @Override // android.content.res.Resources
    @l
    public InputStream openRawResource(int i10, @m TypedValue typedValue) throws Resources.NotFoundException {
        return this.resources.openRawResource(i10, typedValue);
    }

    @Override // android.content.res.Resources
    @m
    public AssetFileDescriptor openRawResourceFd(int i10) throws Resources.NotFoundException {
        return this.resources.openRawResourceFd(i10);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(@m String str, @m AttributeSet attributeSet, @m Bundle bundle) throws XmlPullParserException {
        this.resources.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(@m XmlResourceParser xmlResourceParser, @m Bundle bundle) throws XmlPullParserException, IOException {
        this.resources.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    @t0(30)
    public void removeLoaders(@l ResourcesLoader... resourcesLoaderArr) {
        this.resources.removeLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    @o(message = "Deprecated in Java")
    public void updateConfiguration(@m Configuration configuration, @m DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.resources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @t0(23)
    public int getColor(int i10, @m Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColor(i10, theme);
    }

    @Override // android.content.res.Resources
    @l
    @o(message = "Deprecated in Java")
    public ColorStateList getColorStateList(int i10) throws Resources.NotFoundException {
        return this.resources.getColorStateList(i10);
    }

    @Override // android.content.res.Resources
    @o(message = "Deprecated in Java")
    @m
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        return this.resources.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    @m
    public Drawable getDrawableForDensity(int i10, int i11, @m Resources.Theme theme) {
        return this.resources.getDrawableForDensity(i10, i11, theme);
    }

    @Override // android.content.res.Resources
    @l
    public String getQuantityString(int i10, int i11) throws Resources.NotFoundException {
        return this.resources.getQuantityString(i10, i11);
    }

    @Override // android.content.res.Resources
    @l
    public String getString(int i10) throws Resources.NotFoundException {
        return this.resources.getString(i10);
    }

    @Override // android.content.res.Resources
    @l
    public CharSequence getText(int i10) throws Resources.NotFoundException {
        return this.resources.getText(i10);
    }

    @Override // android.content.res.Resources
    public void getValue(int i10, @m TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.resources.getValue(i10, typedValue, z10);
    }

    @Override // android.content.res.Resources
    @l
    public InputStream openRawResource(int i10) throws Resources.NotFoundException {
        return this.resources.openRawResource(i10);
    }
}
