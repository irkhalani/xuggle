/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * Represents one raw (undecoded) picture in a video stream, plus a 
 * timestamp  
 * for when to display that video picture relative to other items in 
 * a {@link IContainer}.  
 * <p>  
 * All timestamps for this object are always in Microseconds.  
 * </p>  
 */
public class IVideoPicture extends IMediaData {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected IVideoPicture(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIVideoPictureUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IVideoPicture obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IVideoPicture object that is actually referring to the
   * exact same underlying native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public IVideoPicture copyReference() {
    if (swigCPtr == 0)
      return null;
    else
    {
      // acquire before making copy to avoid memory allocator being
      // overridden
      IVideoPicture retval = null;
      this.acquire();
      try {
         retval = new IVideoPicture(swigCPtr, false);
      } catch (Throwable t) {
        this.release();
        throw new RuntimeException(t);
      }
      return retval;
    }
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IVideoPicture)
      equal = (((IVideoPicture)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  /**
   * Releases any underlying native memory and marks this object
   * as invalid.
   * <p>
   * Normally Ferry manages when to release native memory.
   * </p>
   * <p>
   * In the unlikely event you want to control EXACTLY when a native 
   * object is released, each Xuggler object has a {@link #delete()}
   * method that you can use. Once you call {@link #delete()},
   * you must ENSURE your object is never referenced again from
   * that Java object -- Ferry tries to help you avoid crashes if you
   * accidentally use an object after deletion but on this but we
   * cannot offer 100% protection (specifically if another thread
   *  is accessing that object EXACTLY when you {@link #delete()} it). 
   * </p>
   */
  

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
    super.delete();
  }


  /**
   * info about this packet
   * @return information about this packet
   */
   
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("pixel type:"+getPixelType()+";");
    result.append("width:"+getWidth()+";");
    result.append("height:"+getHeight()+";");
    result.append("time stamp:"+getTimeStamp()+";");
    result.append("complete:"+isComplete()+";");
    result.append("size:"+getSize()+";");
    result.append("key:"+isKey()+";");
    IRational timeBase = IRational.make(1,(int)Global.DEFAULT_PTS_PER_SECOND);
    result.append("time base:"+timeBase+";");
    if (timeBase != null) timeBase.delete();
    result.append("]");
    return result.toString();
  }


/**
 * Is this a key frame?  
 * @return	is this a key frame  
 */
  public boolean isKeyFrame() {
    return XugglerJNI.IVideoPicture_isKeyFrame(swigCPtr, this);
  }

/**
 * Reset if this is a key frame or not. Note that regardless of how 
 *  
 * this flag is set, an IVideoPicture always contains raw video data 
 * (hence the  
 * key setting isn't really that important).  
 * @param	aIsKey True if a key frame; false if not.  
 */
  public void setKeyFrame(boolean aIsKey) {
    XugglerJNI.IVideoPicture_setKeyFrame(swigCPtr, this, aIsKey);
  }

/**
 * Is this picture completely decoded?  
 * @return	is this picture completely decoded?  
 */
  public boolean isComplete() {
    return XugglerJNI.IVideoPicture_isComplete(swigCPtr, this);
  }

/**
 * Total size in bytes of the decoded picture.  
 * @return	number of bytes of decoded picture  
 */
  public int getSize() {
    return XugglerJNI.IVideoPicture_getSize(swigCPtr, this);
  }

/**
 * What is the width of the picture.  
 * @return	the width of the picture  
 */
  public int getWidth() {
    return XugglerJNI.IVideoPicture_getWidth(swigCPtr, this);
  }

/**
 * What is the height of the picture  
 * @return	the height of the picture  
 */
  public int getHeight() {
    return XugglerJNI.IVideoPicture_getHeight(swigCPtr, this);
  }

/**
 * Returns the pixel format of the picture.  
 * @return	the pixel format of the picture.  
 */
  public IPixelFormat.Type getPixelType() {
    return IPixelFormat.Type.swigToEnum(XugglerJNI.IVideoPicture_getPixelType(swigCPtr, this));
  }

/**
 * What is the Presentation Time Stamp (in Microseconds) of this picture. 
 *  
 * The PTS is is scaled so that 1 PTS =  
 * 1/1,000,000 of a second.  
 * @return	the presentation time stamp (pts)  
 */
  public long getPts() {
    return XugglerJNI.IVideoPicture_getPts(swigCPtr, this);
  }

/**
 * Set the Presentation Time Stamp (in Microseconds) for this picture. 
 *  
 * @see		#getPts()  
 * @param	value the new timestamp  
 */
  public void setPts(long value) {
    XugglerJNI.IVideoPicture_setPts(swigCPtr, this, value);
  }

/**
 * This value is the quality setting this VideoPicture had when it was 
 *  
 * decoded, or is the value to use when this picture is next  
 * encoded (if reset with setQuality()  
 * @return	The quality.  
 */
  public int getQuality() {
    return XugglerJNI.IVideoPicture_getQuality(swigCPtr, this);
  }

/**
 * Set the Quality to a new value. This will be used the  
 * next time this VideoPicture is encoded by a StreamCoder  
 * @param	newQuality The new quality.  
 */
  public void setQuality(int newQuality) {
    XugglerJNI.IVideoPicture_setQuality(swigCPtr, this, newQuality);
  }

/**
 * Return the size of each line in the VideoPicture data. Usually there 
 *  
 * are no more than 4 lines, but the first line no that returns 0  
 * is the end of the road.  
 * @param	lineNo The line you want to know the (byte) size of.  
 * @return	The size (in bytes) of that line in data.  
 */
  public int getDataLineSize(int lineNo) {
    return XugglerJNI.IVideoPicture_getDataLineSize(swigCPtr, this, lineNo);
  }

/**
 * After modifying the raw data in this buffer, call this function to 
 *  
 * let the object know it is now complete.  
 * @param	aIsComplete Is this VideoPicture complete  
 * @param	format The pixel format of the data in this picture. Must 
 *		 match  
 * what the picture was originally constructed with.  
 * @param	width The width of the data in this picture. Must match what 
 *		  
 * the picture was originally constructed with.  
 * @param	height The height of the data in this picture. Must match 
 *		 what  
 * the picture was originally constructed with.  
 * @param	pts The presentation timestamp of the picture that is now 
 *		 complete.  
 * The caller must ensure this PTS is in units of 1/1,000,000 seconds. 
 *  
 */
  public void setComplete(boolean aIsComplete, IPixelFormat.Type format, int width, int height, long pts) {
    XugglerJNI.IVideoPicture_setComplete(swigCPtr, this, aIsComplete, format.swigValue(), width, height, pts);
  }

/**
 * Copy the contents of the given picture into this picture. All  
 * buffers are copied by value, not be reference.  
 * @param	srcPicture The picture you want to copy.  
 * @return	true if a successful copy; false if not.  
 */
  public boolean copy(IVideoPicture srcPicture) {
    return XugglerJNI.IVideoPicture_copy(swigCPtr, this, IVideoPicture.getCPtr(srcPicture), srcPicture);
  }

/**
 * Get a new picture object.  
 * <p>  
 * You can specify -1 for width and height, in which case all getData() 
 * methods  
 * will return error until XUGGLER decodes something into this frame. 
 * In general  
 * you should always try to specify the width and height.  
 * </p>  
 * <p>  
 * Note that any buffers this objects needs will be  
 * lazily allocated (i.e. we won't actually grab all  
 * the memory until we need it).  
 * </p>  
 * <p>This is useful because  
 * it allows you to hold a IVideoPicture object that remembers  
 * things like format, width, and height, but know  
 * that it doesn't actually take up a lot of memory until  
 * the first time someone tries to access that memory.  
 * </p>  
 * @param	format The pixel format (for example, YUV420P).  
 * @param	width The width of the picture, in pixels, or -1 if you want 
 *		 XUGGLER to guess when decoding.  
 * @param	height The height of the picture, in pixels, or -1 if you 
 *		 want XUGGLER to guess when decoding.  
 * @return	A new object, or null if we can't allocate one.  
 */
  public static IVideoPicture make(IPixelFormat.Type format, int width, int height) {
    long cPtr = XugglerJNI.IVideoPicture_make__SWIG_0(format.swigValue(), width, height);
    return (cPtr == 0) ? null : new IVideoPicture(cPtr, false);
  }

/**
 * Get a new picture by copying the data in an existing frame.  
 * @param	src The picture to copy.  
 * @return	The new picture, or null on error.  
 */
  public static IVideoPicture make(IVideoPicture src) {
    long cPtr = XugglerJNI.IVideoPicture_make__SWIG_1(IVideoPicture.getCPtr(src), src);
    return (cPtr == 0) ? null : new IVideoPicture(cPtr, false);
  }

}
